package com.study.product.dto;

import com.study.product.entity.Product;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class InsertProductReqDto {
	private String productName;
	private int productPrice;
	private String productSize;
	
	public Product toPro() {
		return Product.builder()
				.name(productName)
				.price(productPrice)
				.size(productSize)
				.build();
				
	}
}
