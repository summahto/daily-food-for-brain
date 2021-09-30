package com.dsa.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//find the minimum difference between 2 subsets of the given array
public class MinimumSubsetSumDiff {

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,5,7} ;
		int sum = 0;
		
		for(int i : arr) {
			sum += i; //we are doing this to find the maximum sum of a subset, basically to find the range
		}
		
 		subsetSumPossible(arr, sum);
		
		
	}

	private static void subsetSumPossible(int[] arr, int range) {
		int n = arr.length;
		Boolean t[][] = new Boolean[n +1][range+1];
		Arrays.fill(t[0], false);
		
		for(int i = 0; i < n+1 ; i++)
			t[i][0] = true;
		
		System.out.println(Arrays.deepToString(t).replace("],", "],\n"));
		
		for(int i = 1; i<n+1; i++) {
			for(int j=1 ; j<range+1 ; j++) {
				if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j - arr[i-1]] || t[i-1][j];
				}
				else
					t[i][j] = t[i-1][j];
			}
		}
		
		System.out.println(Arrays.deepToString(t).replace("],", "],\n"));
			
		List <Integer> sumPossible = new ArrayList<>();
		
		for(int j=0; j<=(range)/2 ; j++) {
			if(t[n][j] == true)
				sumPossible.add(j);
		}
		
		System.out.println("final sum array containing list of elements which are possible sum :" + sumPossible.toString());
		int s1 = 2*sumPossible.get(sumPossible.size() -1);
		System.out.println("s1 :" + s1 + " range: " + range);
		
		System.out.println("minimum subset sum is : " + (range - s1));
	}
	
	
	
	

}
