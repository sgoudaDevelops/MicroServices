package com.softtek.controller;


import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Insurance/api")
public class InsuranceServiceController {
	@Value("${server.port}")
	private int port;
	@Value("${eureka.instance.instance-id}")
	private String instanceId;

	@GetMapping("/info")
	public ResponseEntity<String> fetchBillingDetails() {
return new ResponseEntity<String>(
				"Final InsuranceAmt=InsuranceAmt-Discount(Rs.5000::" + "using instances::->" + instanceId + "@port::" + port,
				org.springframework.http.HttpStatus.OK);
	}

}
