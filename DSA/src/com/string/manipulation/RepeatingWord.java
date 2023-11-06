package com.string.manipulation;

import java.util.HashSet;
import java.util.Set;

public class RepeatingWord {

	public static void main(String[] args) {

		String s = "He had said that he would be happy if he had money";
		
		System.out.println(findRepeatingWord(s));
	}

	private static String findRepeatingWord(String s) {
		
//		StringBuilder  sb = new StringBuilder(s);
		String [] words = s.split(" ");
		
		Set<String> wordSet = new HashSet<>();
		
		for(String word : words) {
			if(wordSet.contains(word))
				return word;
			
			else {
				wordSet.add(word);
			}
		}
		
		return null;
		
		
	}

}
