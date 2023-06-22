package com.softtek.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeOperationsController {
	@Value("${dbuser}")
	private String user;
	@Value("${dbmanager}")
	private String password;
	@GetMapping("/show")
	public String Showdata() {
		return "Data collected through configuration server 2nd copy::"+user+"    "+password;
		
	}

}
