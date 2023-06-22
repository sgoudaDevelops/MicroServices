package com.softtek.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
@RefreshScope
public class EmployeeOperationsController {
	@Value("${dbuser}")
	private String user;
	@Value("${dbpwd}")
	private String password;
	@GetMapping("/show")
	public String Showdata() {
		return "Data collected through configuration server 2nd copy::"+user+"    "+password;
		
	}

}
