package com.softtek.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchServiceController {

	@GetMapping("/display")
	public String displayMessage() {
		return "welcome to the flipkart search service";
	}
	@GetMapping("/postEmp")
	public String emppost()
	{
		return "emp added";
	}
}
