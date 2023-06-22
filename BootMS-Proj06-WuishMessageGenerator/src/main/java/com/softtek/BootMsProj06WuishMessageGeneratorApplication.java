package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootMsProj06WuishMessageGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj06WuishMessageGeneratorApplication.class, args);
	}

}
