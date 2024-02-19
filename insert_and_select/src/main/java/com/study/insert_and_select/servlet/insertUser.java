package com.study.insert_and_select.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.product.dto.InsertProductReqDto;
import com.study.product.dto.InsertUserReqDto;
import com.study.product.utils.RequestUtil;


@WebServlet("/user")
public class insertUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public insertUser() {
        super();
       
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		InsertUserReqDto dto = RequestUtil.convertJsonData(request,InsertUserReqDto.class);
		
		System.out.println(dto);
		doGet(request, response);
	}

}
