package com.string.manipulation;

public class CircularPrinter {

	public static void main(String[] args) {
		String s = "BXDA";
		s= "A" + s;
		int sum = 0;
		for(int i =0 ; i+1< s.length();i++) {
			int diff = s.charAt(i+1) - s.charAt(i);
			diff = Math.abs(diff);
			int min = Math.min(diff, 26 - diff);
			sum += min;
		}
		
		System.out.println(sum);


	}

}
