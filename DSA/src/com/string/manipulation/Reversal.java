package com.string.manipulation;

public class Reversal {

	public static void main(String[] args) {
		
		String str = "malayalam";
		String revString = reverseUsingStrBuilder(str);
		System.out.println(revString);
		
		System.out.println(reverseManually(str));
		StringBuilder sb = new StringBuilder(str);
		
		
		Boolean isPalindrome = true;
		for(int i=0 ; i<str.length()/2 ; i++) {
			
			if (sb.charAt(i) != sb.charAt(str.length()-i-1)) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println(sb.toString() +" is a palindrome");
			}
			else {
				System.out.println(sb.toString() +" is not a palindrome");
			}
		
//		if (str.equalsIgnoreCase(revString)) {
//			System.out.println(str.toString() +" is a palindrome");
//		}
//		else {
//			System.out.println(str.toString() +" is not a palindrome");
//		}
	}

	private static String reverseUsingStrBuilder(String str) {
		
		String sb = new StringBuilder(str).reverse().toString();
		return sb;
		
	}
	
	public static String reverseManually(String str) {
		
		StringBuilder sb = new StringBuilder();
		for(int i= str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
		
		
	}

}
