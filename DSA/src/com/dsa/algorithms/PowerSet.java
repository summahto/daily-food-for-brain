package com.dsa.algorithms;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public static void main(String[] args) {
		int arr[] = {1,2,3} ;
		int n = arr.length;
		
		
		
		System.out.println(powerSet(arr, n).toString());
	}

	private static List<ArrayList<Integer>> powerSet(int[] arr, int n) {
		
		List<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
		outer.add(new ArrayList<>());
		
		for( int a : arr) {
			int size = outer.size();
			for(int i = 0; i< size; i++) {
				List<Integer> subset = new ArrayList<>(outer.get(i));
				subset.add(a);
				outer.add((ArrayList<Integer>) subset);
				
			}
		}
		return outer;
			
	}

}
