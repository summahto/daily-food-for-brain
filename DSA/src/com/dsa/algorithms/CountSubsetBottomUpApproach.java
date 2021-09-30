package com.dsa.algorithms;

import java.util.Arrays;

public class CountSubsetBottomUpApproach {

	public static void main(String[] args) {
		int arr[] = {6, 2, 5, 4, 3, 7, 9, 8} ;
//		int arr[] = {3,3,3,3} ;
		
		int sum = 43;
		
		System.out.println("total count of the subsets with sum " + sum + " is " + countSubset(arr,sum));
		
	}

	private static int countSubset(int[] arr, int sum) {
		int n = arr.length;
		int t[][] = new int [n+1][sum+1];
		
		Arrays.fill(t[0], 0);
		for(int i=0 ; i< n+1 ; i++)
			t[i][0] = 1;
		
		for(int i =1; i<n+1; i++) {
			for(int j=1; j<sum+1 ; j++) {
				
				if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
				}else
					t[i][j] = t[i-1][j];
			}
		}
		
		return t[n][sum];
	}

}
