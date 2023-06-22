package com.softtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class SpringBootMicroServiceCicuitBreakerPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroServiceCicuitBreakerPocApplication.class, args);
	}

}
