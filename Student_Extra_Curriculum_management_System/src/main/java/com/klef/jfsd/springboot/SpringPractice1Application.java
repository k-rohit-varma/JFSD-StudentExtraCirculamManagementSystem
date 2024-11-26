package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringPractice1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringPractice1Application.class, args);
		System.out.println("SPRING SDP PROJECT STARTED");
	}
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
}
