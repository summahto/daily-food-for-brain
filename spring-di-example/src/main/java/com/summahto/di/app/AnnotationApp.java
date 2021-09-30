package com.summahto.di.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.summahto.di.config.AnnotationConfig;
import com.summahto.di.config.AutomatedAnnotationConfig;
import com.summahto.di.domain.Car;

public class AnnotationApp {
	
	
	public static void main(String args[]) {
		//1. this is for Basic Java Configuration
//		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		//2. this is for Automated Java Configuration - dependency injection(Autowiring and Components)
		ApplicationContext context = new AnnotationConfigApplicationContext(AutomatedAnnotationConfig.class);
		Car car = context.getBean(Car.class);
		car.start();
	}
}
