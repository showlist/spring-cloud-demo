package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.HelloService;

@RestController
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world from service1 with server port is " + helloService.getServerPort();
	}
	
	@GetMapping("/test")
	public String test() {
		return "test form service1 with server port is " + helloService.getServerPort();
	}

}
