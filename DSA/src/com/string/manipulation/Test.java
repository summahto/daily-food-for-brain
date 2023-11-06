package com.string.manipulation;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		String s = "AABBBC";
		int k = 2;

//		System.out.println(characterReplacement(s,k));

		for (int i=0; i<128; i++){
			System.out.println(i + " -> " + (char)(i));
		}



	}

	private static int characterReplacement(String s, int k) {
		int len = s.length();
		int[] count = new int[26];
		int start = 0, maxCount = 0, maxLength = 0;
		for (int end = 0; end < len; end++) {
			maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
			while (end - start + 1 - maxCount > k) {
				count[s.charAt(start) - 'A']--;
				start++;
			}
			maxLength = Math.max(maxLength, end - start + 1);
			System.out.println("end: " + end + " start:" + start + " maxCount : "+ maxCount + " maxLength: " + maxLength );
		}
		return maxLength;
	}

}
