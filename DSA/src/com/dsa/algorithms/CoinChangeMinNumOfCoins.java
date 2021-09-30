package com.dsa.algorithms;

public class CoinChangeMinNumOfCoins {

	public static void main(String[] args) {
		int arr[] = {3,5,7,8} ;
		int sum = 25;
		
		System.out.println("minimum num of coins required :" +coinChange(arr, sum));

	}

	private static int coinChange(int[] coins, int amount) {
		int n = coins.length;
        int t[][] = new int[n+1][amount+1];
        
        for(int j = 1; j<amount+1 ; j++)
            t[0][j] = Integer.MAX_VALUE - 1;
        
        for(int i = 0; i< n+1 ;i++)
        	t[i][0] = 0;
        
        for(int i=1 ; i<n+1 ; i++) {
        	for(int j=1 ; j<amount+1 ; j++) {
        		if(coins[i-1] <= j) {
        			t[i][j] = Math.min((1 + t[i][j- coins[i-1]]), t[i-1][j]);
        		}else
        			t[i][j] = t[i-1][j];
        		
        	}
        }
        
        return t[n][amount];
	}

}
