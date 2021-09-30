package com.dsa.algorithms;

public class isSubsetSumRecursive {

	public static void main(String[] args) {
		
		
		int arr[] = {11, 2, 5, 4, 7} ;
		int n = arr.length;
		int sum = 0;
		System.out.println("-- Start time---" + System.currentTimeMillis() );
		
		System.out.println("isSubsetSum Possible : " + isSubsetSum(arr, sum, n));
		
		System.out.println("-- End time---" + System.currentTimeMillis() );
	}

	private static boolean isSubsetSum(int[] arr, int sum, int n) {
		
		if(sum == 0)
			return true;
		
		if(n == 0 && sum != 0)
			return false;
		
		if(arr[n-1] <= sum) {
			return isSubsetSum(arr, sum-arr[n-1], n-1 ) || isSubsetSum(arr, sum, n-1);
		}
		else {
			return isSubsetSum(arr, sum, n-1);
		}
		
	}
	
	
	
	
	
	

}
