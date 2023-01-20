package com.string.manipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = "below";
		String s2 = "wobelo";
		int a = 'a';
		
		System.out.println(a);
		System.out.println(isAnagramByHashMap(s1,s2));

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


	public static boolean isAnagramBySorting(String s, String t){
		char [] sArray = s.toCharArray();
		char [] tArray = t.toCharArray();

		Arrays.sort(sArray);
		Arrays.sort(tArray);

		if(Arrays.compare(sArray, tArray) == 0)
			return true;
		else
			return false;


	}

	public static boolean isAnagramByHashMap(String s, String t){
		if(s.length() != t.length())
			return false;

		Map<Character, Integer> countMap = new HashMap<>();

		for(int i =0; i< s.length(); i++){
			countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0) +1);
			countMap.put(t.charAt(i), countMap.getOrDefault(t.charAt(i), 0) -1);
		}

		for (char key : countMap.keySet()){
			if(countMap.get(key) != 0)
				return false;
		}

		return true;
	}

}
