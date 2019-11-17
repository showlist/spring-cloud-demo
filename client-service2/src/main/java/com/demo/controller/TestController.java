package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.remote.RemoteService;

@RestController
public class TestController {

	@Autowired
	private RemoteService remoteService;

	@Value("${config.hello}")
	private String test;

	@GetMapping("/test")
	public String test() {
		
		return remoteService.test() + test;
	}

}
