package com.dsa.algorithms;

public class CountSubset {

	public static void main(String[] args) {
		int arr[] = {6, 2, 5, 4, 3, 7, 9, 8} ;
//		int arr[] = {3,3,3,3} ;
		int n = arr.length;
		int sum = 12;
		System.out.println("-- Start time---" + System.currentTimeMillis() );
		
		System.out.println("isSubsetSum Possible : " + countSubsetSum(arr, sum, n));
		
		System.out.println("-- End time---" + System.currentTimeMillis() );

	}

	private static int countSubsetSum(int[] arr, int sum, int n) {
		
		System.out.println("Iteration number :" + (n-1));
		if(sum == 0 && arr[n-1] != 0)
			return 1;
		
		if(n == 0) 
			return 0;
		
		if(arr[n-1] <= sum) 
			return countSubsetSum(arr, sum- arr[n-1], n-1) + countSubsetSum(arr, sum, n-1);
		else
			return countSubsetSum(arr, sum, n-1);
			
	}

}
