package com.softtek.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.softtek.client.IHospitalServiceRestConsumer;

@RestController
@RequestMapping("/Hospital/api")
public class hospitalServiceController {

	@Autowired
	private IHospitalServiceRestConsumer client;
	
	@GetMapping("/bill")
	public String doShopping()
	{
		System.out.println("shopping controler"+client.getClass());
		return "pongal shopping"+  client.getBillingInfo();
	}
	
}
