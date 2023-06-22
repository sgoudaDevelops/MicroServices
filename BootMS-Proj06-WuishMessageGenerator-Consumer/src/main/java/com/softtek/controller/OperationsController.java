package com.softtek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.client.MessageServiceClient;

@RestController
@RequestMapping("/wishh/api")
public class OperationsController {
	
	@Autowired
	private MessageServiceClient client;
	
	@GetMapping("/gen")
	public ResponseEntity<String> genMessage()
	{
		String message = client.getMessage();
        String wishMessage = "Happy Birthday " + message;
        
        try {
			Thread.sleep(20000);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return new ResponseEntity<String>(" wish Message is ="+wishMessage, HttpStatus.OK);
	}

}
