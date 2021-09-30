package com.leetcode.questions;

public class PalindromeNumber {

	public static void main(String[] args) {
		int x = -121;
		int y = x;
		String s = new String();
		while(x != 0) {
			s += x%10 ;
			x = x/10;
		}
		
		System.out.println(s);
		if(y < 0)
			sys
		if(y == Integer.parseInt(s))
			System.out.println("given number is a palindrom");
		else
			System.out.println("Not a palindrome");
		
	}

}
