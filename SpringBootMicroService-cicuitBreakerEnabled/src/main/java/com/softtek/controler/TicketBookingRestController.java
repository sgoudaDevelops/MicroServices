package com.softtek.controler;

import java.util.Random;

import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/ticket")

public class TicketBookingRestController {
	@GetMapping("/book")
	@HystrixCommand(fallbackMethod = "dummyBookTicket",commandProperties = {
			@HystrixProperty(name = "circuitBreaker.enabled",value="true"),
			@HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value="10000"),
			@HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="4")
	})
	public String bookTicket()
	{
		System.out.println("TicketBookingRestController.bookTicket()");
		if( new Random().nextInt(10)<5) {
			
			throw new RuntimeException("problem b logic");}
		System.out.println("sucess");
		return "Output from b.logic";
}
	public String dummyBookTicket()
	{
		System.out.println("TicketBookingRestController.dummyBookTicket()");
		return "please try later -- Inconvience is regreted";
	}

}
