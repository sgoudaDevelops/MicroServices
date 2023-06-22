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
@RequestMapping("/shopping/api")
public class ShoppingServiceController {

	@Autowired
	private BillingServiceRestConsumer client;
	
	@GetMapping("/cart")
	public ResponseEntity<String> doShopping()
	{
		//use the client comp
		String resultMsg=client.getBillingInfo();
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return new ResponseEntity<String >("Shopping the items(shourts,trouser)::"+resultMsg,HttpStatus.OK);
	}
	
}
