package com.summahto.di.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Bar {
	
	private Foo foo;
	
	@Autowired
	public Bar(Foo foo) {
		this.foo = foo;
	}
}
