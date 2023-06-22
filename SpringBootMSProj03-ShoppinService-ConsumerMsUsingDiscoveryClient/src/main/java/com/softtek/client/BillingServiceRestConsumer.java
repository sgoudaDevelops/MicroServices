package com.softtek.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {

	@Autowired
	private LoadBalancerClient client;

	public String getBillingInfo() {
		// get the Billing-service instance from eureka server based on the load factor
		ServiceInstance insatnce = client.choose("Billing-service");
		// get the URI from the url
		String url = insatnce.getUri() + "/billing/api/info";

		RestTemplate template = new RestTemplate();
		ResponseEntity<String> reponse = template.getForEntity(url, String.class);
		String body = reponse.getBody();
		return body;
	}

}
