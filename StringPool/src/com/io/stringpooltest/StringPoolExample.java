package com.io.stringpooltest;

public class StringPoolExample {
	
	public static void main (String [] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		String s = "Java - 8";
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		s3 = s3.intern();
		
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s3 == s1);
		
		
		
	}
}
