package com.dsa.algorithms;

import java.util.Arrays;

public class SubsetSumBottomUp {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 5, 4, 7, 9} ;
		int n = arr.length;
		int sum = 8;
		
		boolean t[][] = new boolean[n+1][sum+1];
		System.out.println("after Initializing");
		System.out.println(Arrays.deepToString(t).replace("],", "],\n"));
		
		for(int j = 0; j< sum+1 ; j++)
			t[0][j] = false;
		
		for(int i=0 ; i<n+1 ; i++) 
			t[i][0] = true;
		
		System.out.println("-- Bottom-Up :Before filling the DP Array --");
		System.out.println(Arrays.deepToString(t).replace("],", "],\n"));
		
		//this is bottom-up approach because we are building from the base condition to the Final solution
		System.out.println(" is Subset with sum possible : " + isSubsetSumBottomUp(arr, n, sum, t));
		
		System.out.println("-- Bottom-Up :After filling the DP Array --");
		System.out.println(Arrays.deepToString(t).replace("],", "],\n"));
		
	}

	private static boolean isSubsetSumBottomUp(int [] arr, int n, int sum, boolean[][] t) {
		
		for(int i=1 ; i<n+1 ; i++) {
			for(int j=1 ; j<sum+1 ;j++) {
				if(arr[i-1] <= j)
					t[i][j] = t[i-1][j - arr[i-1]] || t[i-1][j];
				else
					t[i][j] = t[i-1][j];
			}
		}
		
		return t[n][sum];
	}

}
