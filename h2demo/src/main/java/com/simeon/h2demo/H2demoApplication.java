package com.simeon.h2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@EnableScheduling
public class H2demoApplication {
	@RequestMapping(method = RequestMethod.GET, value = "/api/TODO")
	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}

}
