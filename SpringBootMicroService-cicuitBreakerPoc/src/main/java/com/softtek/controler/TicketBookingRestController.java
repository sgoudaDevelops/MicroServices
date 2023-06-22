package com.softtek.controler;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/ticket")
public class TicketBookingRestController {
	@GetMapping("/book")
	@HystrixCommand(fallbackMethod = "dummyBookTicket")
	public String bookTicket()
	{
		System.out.println("TicketBookingRestController.bookTicket()");
		if( new Random().nextInt(10)<5)
			throw new RuntimeException("problem b logic");
		return "Output from b.logic";
}
	public String dummyBookTicket()
	{
		System.out.println("TicketBookingRestController.dummyBookTicket()");
		return "please try later -- Inconvience is regreted";
	}

}
