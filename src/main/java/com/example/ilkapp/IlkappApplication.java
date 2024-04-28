package com.example.ilkapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.apache.logging.log4j.*;


@SpringBootApplication
public class IlkappApplication extends SpringBootServletInitializer {
	
	private static Logger demologger = LogManager.getLogger(IlkappApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(IlkappApplication.class, args);
		
		demologger.info("Click Successfull");
		demologger.error("DB Connection failed");
		demologger.debug("this is debug");
		demologger.fatal("this is fatal");
		
		
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(IlkappApplication.class);
	}
}
