package com.softtek.controller;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private Logger logger = LoggerFactory.getLogger(ShoppingServiceController.class);

	@GetMapping("/details")
	public ResponseEntity<String> displayShoppingDetails() {
		logger.info("At beginning of displayShoppingDetails() method--Shopping Service");
		// use Client component support to invoke provider MS service
		logger.info("before calling provider MS");
		String billingInfo = client.getBillingInfo();
		// String resultBody = entity.getBody();  // Provider MS result
		logger.info("After calling provider MS");
		String billInfo = "Bill Amount::" + new Random().nextInt(100000); // consumer MS result
		logger.info("At End of displayShoppingDetails() method--Shopping Service");
		return new ResponseEntity<String>(billInfo, HttpStatus.OK);
	}
//	@GetMapping("/cart")
//	public String doShopping()
//	{
//		System.out.println("shopping controler"+client.getClass());
//		return "pongal shopping"+  client.getBillingInfo();
//	}
//	
}
