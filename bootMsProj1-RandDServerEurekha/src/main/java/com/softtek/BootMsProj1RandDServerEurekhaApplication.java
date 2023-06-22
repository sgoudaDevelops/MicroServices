package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  // enables the eurekha R & D server related autoconfiguration activities
public class BootMsProj1RandDServerEurekhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj1RandDServerEurekhaApplication.class, args);
	}

}
