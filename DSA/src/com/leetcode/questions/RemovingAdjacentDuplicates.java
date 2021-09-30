package com.leetcode.questions;

import java.util.Arrays;
import java.util.Stack;

public class RemovingAdjacentDuplicates {

	public static void main(String[] args) {
		String s = "deeedbbbda";
		System.out.println("Before removing adjacent duplicates the String looks like : " + s);
		String latest = removeDuplicates(s, 3);
		System.out.println("after removing adjacent duplicates the String looks like : " + latest);
	}

	private static String removeDuplicates(String s, int k) {
		
		int i = 0, n = s.length(), count[] = new int[n];
		char [] res = s.toCharArray();
		
		for(int j = 0; j<n ; j++,i++) {
			res[i] = res[j];
			
			count[i] = i>0 && res[i-1] == res[i] ? count[i-1] + 1 : 1;  
			if( count[i] == k)
					i = i-k;
			}
		
		return new String(res, 0, i);
	}

}
