package com.test;

public class StringTest {

	public static void main(String[] args) {
		
		String s = "Ravi";
		String s1 = "Ravi";
		String s2 = new String("Ravi");
		
		System.out.println("addresses stored in variables" + s + " " + s1 + " " + s2);
		System.out.println(s == s1);
		System.out.println(s == s2);

	}

}
