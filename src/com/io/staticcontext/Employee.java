package com.io.staticcontext;

import java.time.Clock;

public class Employee {
	
	
	private int id;
	String firstName;
	String lastName;
	
	static int numOfEmployees = 0;
	static int a;
	static int b;
	int c = 30;
	public Employee() {
		
	}
	
	public Employee(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Employee.numOfEmployees++;
	}
	
	static {
		System.out.println(a);
		System.out.println(b);

	}
	
	public void testStaticVariables() {
		a = a+10;
		b = b+20;
	}
	
	
	
	public static void main(String args[]) {
		
		//static int c = 10; does not work because static is scoped to class context, so declaring a static variable in
		// a static method does not makes sense.
		Employee emp = new Employee();
		emp.testStaticVariables();
	}

	
	
}
