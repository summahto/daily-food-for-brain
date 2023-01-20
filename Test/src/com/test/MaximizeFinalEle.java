package com.test;


import java.util.List;

import java.util.Collections;
import java.util.Arrays;

public class MaximizeFinalEle {

	
	public static void main(String[] args) {
		
		int n = 4;
	    Integer arr[] = { 3, 1, 3, 4 };
	   
	    List<Integer> list = Arrays.asList(arr);
	    int max = maximizeFinalElement(list, n);
	    System.out.print(max);
		
	}

	private static int maximizeFinalElement(List<Integer> arr, int n) {
		
		Collections.sort(arr);
		
		if(arr.get(0) != 1)
			arr.set(0, 1);

		for(int i = 1; i < n; i++)
	    {
	        if (arr.get(i) - arr.get(i-1) > 1)
	        {
	        	arr.set(i, arr.get(i-1) + 1);
	        }
	    }
	    return arr.get(n-1);
		
	}
}
