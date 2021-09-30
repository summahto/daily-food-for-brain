package com.summahto.di.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Foo {
	
	private Bar bar;
	
	@Autowired
	public Foo(@Lazy Bar bar) {
		this.bar = bar;
	}
	
	public void doSomething() {
		System.out.println("Inside foo - Yay!!! Circular dependency broken");
	}
}
