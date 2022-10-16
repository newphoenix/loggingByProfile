package com.example.loggingByProfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j	
public class LoggingByProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingByProfileApplication.class, args);
		
		log.warn("***** WARN");
		log.error("***** ERROR");
	}

}
