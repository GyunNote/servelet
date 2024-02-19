package com.study.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.study.product.dao.ProductDao;
import com.study.product.dto.InsertProductReqDto;
import com.study.product.dto.SearchProductRespDto;
import com.study.product.dto.insertProductRespDto;
import com.study.product.entity.Product;

public class ProductService {
	
	private static ProductService instance;
	private ProductDao productDao;
	
	private ProductService() {
	 productDao = ProductDao.getInstance();
	}
	public static ProductService getInstance() {
		if(instance == null) {
			instance = new ProductService();
		}
		return instance;
	}
	
	public boolean isduplicatedProductName(String name) {
		boolean result = false;
		result = productDao.findProductByName(name) != null;
		
		return result;
	}
	
	public insertProductRespDto addProduct(InsertProductReqDto insertProductReqDto) {
		Product product = insertProductReqDto.toPro();
		
		int successCount = productDao.saveProduct(product);
		
		return product.toInsertDto(successCount);
	}
	public List<SearchProductRespDto> searchProduct(){
	//	List<SearchProductRespDto> searchProductRespDtos = new ArrayList<>();
		List<Product> products = productDao.getProductList();
		
	//	for(Product product : products) {
	//		searchProductRespDtos.add(product.toSearchDto());
	//	}
		
		//return searchProductRespDtos;
		return products.stream()
		.map(vo -> vo.toSearchDto())
		.collect(Collectors.toList());
		

//		return productDao.getProductList().stream()
//				.map(Product :: toSearchDto)
//				.collect(Collectors.toList());
	}
}
