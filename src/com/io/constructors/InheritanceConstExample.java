package com.io.constructors;

public class InheritanceConstExample {
	
	
	public static void main(String[] args) {
		
		Derived d = new Derived("Sumit");
	}
}


class Base {
	
	String x;
	
	public Base() {
		System.out.println("Base class default constructor");
	}
	
	public Base(String x) {
		System.out.println(x);
	}
	
}

class Derived extends Base{
	
	public Derived(String x) {
		System.out.println(x);
	}
	
}

	

