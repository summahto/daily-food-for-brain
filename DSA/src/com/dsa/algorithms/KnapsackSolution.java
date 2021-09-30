package com.dsa.algorithms;

import java.util.Arrays;

public class KnapsackSolution {

	public static void main(String[] args) {
		
		int val[] = {6, 10, 12, 19};
		int wt[] = {1, 2, 3, 4} ;
		int n = wt.length;
		int W = 7;
		int t[][] = new int [n+1][W+1];
		
		for(int [] row : t)
			Arrays.fill(row, -1);;
		
		System.out.println("-- Memoization :Before filling the DP Array --");
		System.out.println(Arrays.deepToString(t).replace("],", "],\n"));
		
		System.out.println("Maximum amount : " + knapsackRecusrion(wt, val, W, n, t));
		
		System.out.println("-- Memoization :After filling the DP Array --");
		System.out.println(Arrays.deepToString(t).replace("],", "],\n"));
		
		
	}

	private static int knapsackRecusrion(int[] wt, int[] val, int W, int n, int t[][]) {
		
		if(W == 0 || n == 0)
			return 0;
		
		if(t[n][W] != -1)
			return t[n][W];
		
		if (wt[n - 1] <= W) {

			return t[n][W] = Math.max(val[n - 1] + knapsackRecusrion(wt, val, W - wt[n - 1], n - 1, t),
					knapsackRecusrion(wt, val, W, n - 1, t));
		}
		else  {
			return t[n][W] = knapsackRecusrion(wt, val, W, n-1, t);
		}
		
	}

}
