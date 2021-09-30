package com.io.staticcontext;

public class StaticExample {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Sumit", "Mahto");
		
		System.out.println(emp1.numOfEmployees);
		
		Employee emp2 = new Employee(1, "Amit", "Mahto");
		Employee emp3 = new Employee(1, "Ramit", "Mahto");
		Employee emp4 = new Employee(1, "Hitmit", "Mahto");
		
		System.out.println(Employee.numOfEmployees);
		
		

	}

}
