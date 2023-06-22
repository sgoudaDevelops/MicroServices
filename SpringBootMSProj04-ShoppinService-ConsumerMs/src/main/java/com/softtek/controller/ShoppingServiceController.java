package com.softtek.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.softtek.client.IBillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping/api")
public class ShoppingServiceController {

	@Autowired
	private IBillingServiceRestConsumer client;
	
	@GetMapping("/cart")
	public String doShopping()
	{
		System.out.println("shopping controler"+client.getClass());
		return "pongal shopping"+  client.getBillingInfo();
	}
	
}
