package com.summahto.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.summahto.di.domain.Camshaft;
import com.summahto.di.domain.Car;
import com.summahto.di.domain.CombustionEngine;
import com.summahto.di.domain.Crankshaft;
import com.summahto.di.domain.Engine;


//1. Basic Configuration - this has 2 problems
//1.1 We are forced to manually define bean for every component that needs to be injected
//1.2 Also we are explicitly mentioning the dependencies TWICE - once in the @Bean method signature and
//	  again in the constructor of the bean.

@Configuration
public class AnnotationConfig {
	
	@Bean
	public Car car(Engine engine) {
		return new Car(engine);
	}
	
	@Bean
	public Engine engine(Crankshaft crankshaft, Camshaft camshaft) {
		return new CombustionEngine(crankshaft, camshaft);
	}
	
	@Bean
	public Camshaft camshaft() {
		return new Camshaft();
	}
	
	@Bean
	public Crankshaft crankshaft() {
		return new Crankshaft();
	}
	
		
}
