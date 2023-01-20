package com.test;

public class StringTest {

	public static void main(String[] args) {
		
		String s = "Ravi";
		String s1 = "Ravi";

		StringBuilder sb = new StringBuilder(s);

		System.out.println(s.substring(2));
		System.out.println(s.substring(0,2) + "c" + s.substring(2, s.length()));

		String s2 = new String("Ravi");
		
//		System.out.println("addresses stored in variables" + s + " " + s1 + " " + s2);
//		System.out.println(s == s1);
//		System.out.println(s == s2);


	}

}
