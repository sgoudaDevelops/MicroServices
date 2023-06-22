package com.softtek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.client.ITicketServiceRestConsumer;

@RestController
@RequestMapping("/theater/api")
public class OperationsController {
	
	@Autowired
	private ITicketServiceRestConsumer consumer;
	
	@GetMapping("/details")
	public String diaplayTicketDeatils()
	{
		System.out.println(consumer.getClass());
        return "Movie " +consumer.fetchTicketDetails();
	}

}
