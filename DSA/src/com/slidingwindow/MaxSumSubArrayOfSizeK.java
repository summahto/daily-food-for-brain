package com.slidingwindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class MaxSumSubArrayOfSizeK {

	public static void main(String[] args) {

		int[] a = {3, 4, 5, 3, 7, 8, 9, 10};
		String s = "string";
		StringBuilder sb = new StringBuilder(s);

		for(int i =0; i<sb.length() ; i++){
			if(sb.charAt(i) > sb.charAt(i+1)){
				sb.deleteCharAt(i);
			}
		}
		System.out.println(sb.toString());

//		System.out.println(String.format("id = %08.2f", 423.147));

	}
}
