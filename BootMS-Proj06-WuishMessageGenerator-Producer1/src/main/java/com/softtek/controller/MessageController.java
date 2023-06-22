package com.softtek.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message/api")
public class MessageController {
	
	@Value("${server.port}")
	private int port;
	
	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	@GetMapping("/wish")
    public String generateWishMessage() {
       return "Muskan";
    }

}
