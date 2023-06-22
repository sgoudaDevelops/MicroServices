package com.softtek.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
@Component
public class MessageServiceClient {
	
	@Autowired
private	LoadBalancerClient client1;
	
	
    public String getMessage()
    {
		ServiceInstance instance = client1.choose("WishMessage");
		 URI uri = instance.getUri();
		String url= uri.toString()+"/message/api/wish";
		
		RestTemplate template= new RestTemplate();
		ResponseEntity<String> resp = template.getForEntity(url, String.class);
		String body = resp.getBody();
		return body;
    }
}
