package com.softtek.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {

	@Autowired
	private DiscoveryClient client;
	
	public String getBillingInfor()
	{
		//find and get service instances of producer by using service id
		List<ServiceInstance> listSI = client.getInstances("Billing-Service");//will return the list of service instances
		
		//use first service instance from the of instances
		ServiceInstance instance = listSI.get(0);
		
		//get producer MS URI and make it as URL
		String url=instance.getUri()+"/billing/info";
		
		//create rest template
		RestTemplate restTemplate = new RestTemplate();
		
		//invoke the producer MS service method or operation by generating HTTP call
		String response = restTemplate.getForObject(url, String.class );
		
		return response;
	}
	
	
}
