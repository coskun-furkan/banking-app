package com.Banking.BankingProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// This annotation marks the class as the main entry point for a Spring Boot application
// It combines @Configuration, @EnableAutoConfiguration, and @ComponentScan

public class BankingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingProjectApplication.class, args);

		// This line starts the entire Spring Boot application
		// It sets up the application context, auto-configures beans, and starts the embedded server (like Tomcat)

	}

}
