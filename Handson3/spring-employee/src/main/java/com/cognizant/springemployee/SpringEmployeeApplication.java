package com.cognizant.springemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cognizant.springemployee")
public class SpringEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeeApplication.class, args);
	}

}
