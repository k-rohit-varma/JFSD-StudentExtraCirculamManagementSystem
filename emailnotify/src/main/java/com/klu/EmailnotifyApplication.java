package com.klu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailnotifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailnotifyApplication.class, args);
		System.out.println("email sending working at port 1234 !!!");
	}

}
