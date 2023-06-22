package com.softtek;

import java.beans.JavaBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsProj02BillingServiceProviderMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj02BillingServiceProviderMsApplication.class, args);
	}

	@Bean
	public Sampler createSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
