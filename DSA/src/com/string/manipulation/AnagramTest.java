package com.string.manipulation;

import java.util.Arrays;
import java.util.Iterator;

public class AnagramTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = "below";
		String s2 = "sdsff";
		int a = 'A';
		
		System.out.println(a);
//		System.out.println(isAnagram(s1,s2));
	}

	private static boolean isAnagram(String s, String t) {
		
		if(s.length() != t.length())
			return false;
		int a[] = new int[26];
		
		for (int i = 0; i<s.length(); i++) {
			a[s.charAt(i) - 'a']++;
			a[t.charAt(i) - 'a']--;
		}
		
		for(int i : a)
			System.out.print(i +" ");
		
		for(int i=0; i<26; i++) {
			if(a[i] != 0) {
				return false;
				
			}
				
		}
		
		return true;
		
	}

}
