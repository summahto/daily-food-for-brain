package com.dsa.algorithms;

import java.util.Arrays;

public class CoinChangeMinNumberRecursive {

	public static void main(String[] args) {
		int coins[] = {1,2,5} ;
		int sum = 9;
		int n = coins.length;
		Integer memo[][] = new Integer[n+1][sum+1];
		
		System.out.println("-- Memoization :Before filling the DP Array --");
		System.out.println(Arrays.deepToString(memo).replace("],", "],\n"));
		
		System.out.println("minimum num of coins required :" +coinChangeRecursive(coins, sum, n, memo));
		
		System.out.println("-- Memoization :After filling the DP Array --");
		System.out.println(Arrays.deepToString(memo).replace("],", "],\n"));

	}

	private static int coinChangeRecursive(int[] coins, int sum, int n, Integer memo[][]) {
		
		if( sum == 0)
			return 0;
		
		if(n == 0 && sum != 0)
			return Integer.MAX_VALUE-1;
		
		if(memo[n][sum] != null)
			return memo[n][sum];
		
		if(coins[n-1] <= sum) {
			
			return memo[n][sum] = Math.min(1 + coinChangeRecursive(coins, sum-coins[n-1], n, memo), 
					coinChangeRecursive(coins, sum, n-1, memo));
		}
		else
			return memo[n][sum] = coinChangeRecursive(coins, sum, n-1, memo);
		
	}

}
