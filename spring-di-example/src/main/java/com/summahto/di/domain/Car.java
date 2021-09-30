package com.summahto.di.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*	Although the @Component annotation does mark a class as eligible to be used as a dependency, 
	it brings with it additional features. Here, Car object is not itself required as a dependency,
	however, we created a bean in the Configuration class, because we wanted to instruct spring how
	to create a car object when one was requested.
	Similarly in Automated scenario we want Spring to create a car object with an Engine dependency,
	hence, we are annotating the Car class with the @Component. 
*/ 
@Component
public class Car {
	
	private Engine engine;
	
	@Autowired
	public Car(@Qualifier("defaultEngine") Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		engine.turnOn();
	}
}
