package com.demo.service;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements ApplicationListener<WebServerInitializedEvent> {

	private Integer port;

	public Integer getServerPort() {
		return this.port;
	}

	@Override
	public void onApplicationEvent(WebServerInitializedEvent event) {
		this.port = event.getWebServer().getPort();
	}
}