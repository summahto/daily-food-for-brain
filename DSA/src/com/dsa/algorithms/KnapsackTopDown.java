package com.dsa.algorithms;

import java.util.Arrays;

public class KnapsackTopDown {

	
public static void main(String[] args) {
		
		int val[] = {1, 3, 4, 6, 8, 10};
		int wt[] = {1, 2, 3, 4, 5, 7} ;
		int n = wt.length;
		int W = 10;
		int t[][] = new int [n+1][W+1];
		
		for(int i = 1 ; i< n+1 ; i++) {
			Arrays.fill(t[i], 1, W+1,-1);//initializing all the elements where n=0 or W =0 with 0 =>making others -1
			
		}
			
		
		System.out.println("-- Memoization :Before filling the DP Array --");
		System.out.println(Arrays.deepToString(t).replace("],", "],\n"));
		
		//this is bottom-up approach because we are building from the base condition to the Final solution
		System.out.println("Maximum amount : " + knapsackBottomUp(wt, val, W, n, t));
		
		System.out.println("-- Memoization :After filling the DP Array --");
		System.out.println(Arrays.deepToString(t).replace("],", "],\n"));
		
		
	}

private static int knapsackBottomUp(int[] wt, int[] val, int W, int n, int[][] t) {
	
	for(int i = 1; i< n+1 ; i++) {
		
		for(int j =1 ; j< W+1 ; j++) {
			if( wt[i-1] <= j ) {
				t[i][j] = Math.max(val[i-1] + t[i-1][j - wt[i-1]], t[i-1][j]);     
			}
			else
				t[i][j] = t[i-1][j];
			
			
		}
	}
	
	return t[n][W];
}

}








