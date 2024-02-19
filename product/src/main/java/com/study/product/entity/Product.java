package com.study.product.entity;

import com.study.product.dto.SearchProductRespDto;
import com.study.product.dto.insertProductRespDto;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class Product {
	private int productId;
	private String name;
	private int price;
	private String size;
	
	public insertProductRespDto toInsertDto(int successCount) {
		
		return insertProductRespDto.builder()
				.successCount(successCount)
				.productId(productId)
				.productName(name)
				.productPrice(price)
				.productSize(size)
				.build();
	}
	public SearchProductRespDto toSearchDto() {
		return SearchProductRespDto.builder()
				.productId(productId)
				.productName(name)
				.productPrice(price)
				.productSize(size)
				.build();
	}
}