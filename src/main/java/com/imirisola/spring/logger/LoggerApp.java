package com.imirisola.spring.logger;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LoggerApp extends SpringBootServletInitializer{
	
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(LoggerApp.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(LoggerApp.class, args);
	}

}
