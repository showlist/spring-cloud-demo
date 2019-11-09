package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.remote.RemoteService;

@RestController
public class TestController {
	
	@Autowired
	private RemoteService remoteService;
	
	@GetMapping("/test")
	public String test() {
		return remoteService.test();
	}

}
