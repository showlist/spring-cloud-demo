package com.demo.service.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "client-service1")
public interface RemoteService {
	
	@GetMapping("/hello")
	String test();

}
