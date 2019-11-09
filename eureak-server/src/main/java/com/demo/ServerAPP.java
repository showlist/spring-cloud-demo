package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerAPP {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServerAPP.class, args);
	}


}
