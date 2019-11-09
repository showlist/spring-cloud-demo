package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApp {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZuulApp.class, args);
	}


}
