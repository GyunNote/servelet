package com.study.product.utils;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.study.product.dto.InsertProductReqDto;

public class RequestUtil {
	public static String getJsonData(HttpServletRequest request) throws IOException {
		
		
		String requestJsonData = null;
		StringBuilder builder = new StringBuilder();
		String readData = null;
		
		BufferedReader reader = request.getReader();
		
		while((readData  = reader.readLine()) != null) {
			builder.append(readData);
		}
		requestJsonData = builder.toString();
		
		return requestJsonData;
		
	}
	
	public static <T> T convertJsonData(HttpServletRequest request , Class<T> classofT) throws IOException {
		
		
		String requestJsonData = null;
		StringBuilder builder = new StringBuilder();
		String readData = null;
		
		BufferedReader reader = request.getReader();
		
		while((readData  = reader.readLine()) != null) {
			builder.append(readData);
		}
		requestJsonData = builder.toString();
		
		Gson gson = new Gson();
		
		return gson.fromJson(requestJsonData, classofT);
		
	}
}













