package com.softtek.controller;


import org.apache.http.HttpStatus;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/billing/api")
// @slf4j if this is used we would'nt have been creater logger the Object Manullay
public class BillingServiceController {
private static org.slf4j.Logger logger = LoggerFactory.getLogger(BillingServiceController.class);
@GetMapping("/info")
public ResponseEntity<String> showPaymentModes(){
	logger.info("At begining of the showPayments().method-billing service");
	ResponseEntity<String> entity= new ResponseEntity<String>("we accept all payments",org.springframework.http.HttpStatus.OK);
	logger.info("at the end of the show payments methods -billing service");
	return entity;
}
	

}
