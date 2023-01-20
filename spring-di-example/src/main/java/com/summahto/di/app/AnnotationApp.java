package com.summahto.di.app;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.summahto.di.config.AnnotationConfig;
import com.summahto.di.config.AutomatedAnnotationConfig;
import com.summahto.di.domain.Car;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.List;

public class AnnotationApp {
	
	
	public static void main(String args[]) throws URISyntaxException {
		//1. this is for Basic Java Configuration
//		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		//2. this is for Automated Java Configuration - dependency injection(Autowiring and Components)
		ApplicationContext context = new AnnotationConfigApplicationContext(AutomatedAnnotationConfig.class);
		Car car = context.getBean(Car.class);
		car.start();

		TypeReference ref = new TypeReference<List<String>>() {};
		ObjectMapper om = new ObjectMapper();
		String name = "trades.json";
		File file = Paths.get(Thread.currentThread().getContextClassLoader().getResource(name).toURI()).toFile();

	}
}
