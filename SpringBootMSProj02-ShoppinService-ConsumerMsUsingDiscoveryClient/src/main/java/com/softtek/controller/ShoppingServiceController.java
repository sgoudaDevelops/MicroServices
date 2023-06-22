package com.softtek.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.client.BillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping")
public class ShoppingServiceController {

	@Autowired
	private BillingServiceRestConsumer client;
	
	@GetMapping("/details")
	public ResponseEntity<String>showBillingDetails()
	{
		String reusltBody = client.getBillingInfor();
		String billingInfo="Bill Amount::"+new Random().nextInt(100000000);
		return new ResponseEntity<String>(billingInfo+"....."+reusltBody,HttpStatus.OK);//contains provider ms+consumer ms
		
		
	}
}
