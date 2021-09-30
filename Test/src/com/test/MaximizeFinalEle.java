package com.test;

import java.util.ArrayList;
import java.util.List;

import edu.emory.mathcs.backport.java.util.Arrays;
import edu.emory.mathcs.backport.java.util.Collections;

public class MaximizeFinalEle {

	
	public static void main(String[] args) {
		
		int n = 4;
	    Integer arr[] = { 3, 1, 3, 4 };
	   
	    List list = Arrays.asList(arr);
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
