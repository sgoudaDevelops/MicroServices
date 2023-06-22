package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsProj02BillingServiceProviderMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj02BillingServiceProviderMsApplication.class, args);
	}

}
