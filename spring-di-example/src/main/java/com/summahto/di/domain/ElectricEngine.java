package com.summahto.di.domain;

import org.springframework.stereotype.Component;

@Component("defaultEngine")
public class ElectricEngine implements Engine {

	@Override
	public void turnOn() {
		System.out.println("Started Electric Engine");
	}
}
