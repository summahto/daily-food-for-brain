package com.summahto.di.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.summahto.di.config.CycleAnnotationConfig;

public class CycleApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CycleAnnotationConfig.class);
		Foo foo = context.getBean(Foo.class);
		foo.doSomething();
	}

}
