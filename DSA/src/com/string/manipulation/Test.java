package com.string.manipulation;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {

		Map<Integer, List<Integer>> rowMap = new HashMap<>();
		int arr [][] =  {
				{1, 2, 3},
				{4, 5},
				{6, 7, 8, 9},
				{10},
				{11, 12, 13}
		};

		int i = 0;
		boolean found = true;
		while(found) {
			found = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].length - 1 >= i) {
					System.out.println(arr[j][i]);
					found = true;
				}
			}
			i++;
		}


		for (int column = 0; column < arr[0].length; column++) {
			for (int row = 0; row < arr.length; row++) {
				System.out.print(arr[row][column]);
			}
		}

		// Print the map to verify
//		System.out.println(rowMap);

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
