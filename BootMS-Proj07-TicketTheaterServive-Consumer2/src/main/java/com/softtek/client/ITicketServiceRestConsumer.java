package com.softtek.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Ticket-Service")
public interface ITicketServiceRestConsumer {

	@GetMapping("/ticket/api/info")
	public String fetchTicketDetails();

}
