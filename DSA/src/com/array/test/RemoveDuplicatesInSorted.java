package com.array.test;

import java.util.Arrays;

public class RemoveDuplicatesInSorted {

	public static void main(String[] args) {
		
		int a[] = {0,0,1,1,1,2,2,3,3,4};
		int n = a.length;
		
		System.out.println(removeDupInSortedArray(a,n));
		System.out.println(Arrays.toString(a));
			
			
		
	}

	private static int removeDupInSortedArray(int[] a, int n) {
		int i = 0, j=1;
		if(a == null || a.length == 0)
			return 0;
		
		while(j< n) {
			if(a[j] != a[i]) {
				i++;
				a[i] = a[j];
			}else
				j++;
		}
		return i+1;
	}
}
