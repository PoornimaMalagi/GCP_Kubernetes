package com.mav.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetailsApplication.class, args);
	}

}
