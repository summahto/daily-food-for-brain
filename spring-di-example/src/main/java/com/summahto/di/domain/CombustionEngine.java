package com.summahto.di.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("legacyEngine")
public class CombustionEngine implements Engine{
	
	private Crankshaft crankshaft;
	private Camshaft camshaft;
	
	@Autowired
	public CombustionEngine(Crankshaft crankshaft, Camshaft camshaft) {
		this.crankshaft = crankshaft;
		this.camshaft = camshaft;
	}
	
	public void turnOn() {
		System.out.println("started  combustion engine.");
		
	}
	
	
}
