package com.product.myproductsmgmtwebapp.config;

import com.product.myproductsmgmtwebapp.MyproductsmgmtwebappApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.boot.web.support.SpringBootServletInitializer;

//import mum.swe.democrud.DemocrudApplication;


public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyproductsmgmtwebappApplication.class);
	}

}