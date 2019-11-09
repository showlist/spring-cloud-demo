package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Service2APP {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Service2APP.class, args);
	}

}
