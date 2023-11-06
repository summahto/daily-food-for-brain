package com.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int arr [] = {3,2,4};
		int target = 6;
		
		System.out.println(Arrays.toString(twoSum(arr , target)));
		

	}

	private static int [] twoSum(int[] a, int target) {
		
		int n = a.length ;
		
		int result [] = new int[2];
		Map<Integer, Integer> pairMap = new HashMap<>(); 
		
		for(int i = 0; i<n ; i++) {
			if(pairMap.containsKey(a[i])) {
				result[0] = pairMap.get(a[i]);
				result[1] = i;
				return result;
			}
			else {
				pairMap.put(target-a[i], i);
			}
		}
		
		return null;
	}

}
