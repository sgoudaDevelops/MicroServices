package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class SpringBootMsProj1ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj1ServiceApplication.class, args);
	}

}
