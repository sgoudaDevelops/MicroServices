package com.softtek.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")	
public class customerOperationController {
  
	@RequestMapping("/show")
	public String displaymsg()
	{
		return "message been displayed";
	}
	
	
	
}
