package com.sorting.alogorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionSort {

	public static void main(String[] args) {
		
		int a[] = {7, 4, 2, 6, 9, 3, 5};
		
//		Random r = new Random();
//		for (int i=0; i<10 ; i++) {
//			a[i] = r.nextInt(1000);
//		}
		
		System.out.println("The array before sorting : "+ "\n" + Arrays.toString(a));
		
//		SelectionSort(a, 10);
//		InsertionSort1(a, 10);
//		InsertionSort2(a,a.length);
		QuickSort(a, 0, (a.length)-1);
		
		System.out.println("The array after sorting thru QS: "+ "\n" + Arrays.toString(a));
		

	}
	
	private static void QuickSort(int a [], int start, int end) {
		
		if (start < end) {
			int pIndex = Partition(a,start,end);
			QuickSort(a, start, pIndex-1);
			QuickSort(a, pIndex+1, end);
		}
		
	}
	
	private static int Partition(int[] a, int start, int end) {
		
		int pIndex = ThreadLocalRandom.current().nextInt(start, end);
		int pivot = a[pIndex];
		int temp = pIndex;
		a[pIndex] = a[end];
		a[end] = temp;
//		int temp;
//		int pivot = a[end];	
//		int pIndex = start;
		for(int i=start; i<end; i++) {
			if(a[i] <= pivot) {
				temp = a[i];
				a[i] = a[pIndex];
				a[pIndex] = temp;
				pIndex++;
			}
					
		}
		
		int temp1 = a[end];
		a[end] = a[pIndex];
		a[pIndex] = temp1;
		System.out.println("Iteration : " + Arrays.toString(a));
		return pIndex;
	}

	private static void InsertionSort2(int[] a, int n) {
		
		for(int i=1; i<n; i++) {
			int temp = a[i];
			int j= i-1; 
			
			while(j>=0 && temp < a[j]) {
				a[j+1] = a[j];
				j--;
				
			}
			a[j+1] = temp;
			System.out.println(Arrays.toString(a));
		}
		System.out.println("the array after sorting using InsertionSort 2 is : \n" + Arrays.toString(a) );
	}

	private static void InsertionSort1(int[] a, int n) {
		
		for (int i=0; i<n-1 ; i++) {
//			int temp = a[i];
			for (int j=i+1,k=i; j>=1 && k>=0; j--, k--) {
				if(a[j] < a[k]) {
					int temp = a[k];
					a[k] = a[j];
					a[j] = temp;
				}
				else {
					break;
				}
			}
		}
		System.out.println("ther array after sorting : " + "\n" + Arrays.toString(a) );
		
	}

	static void SelectionSort(int a[], int n) {
		
		for (int i=0; i<n-1 ; i++) {
			int min = a[i];
			
			for(int j=i+1; j<n ; j++) {
				if( a[j]< min) {
					min = a[j];
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("the array after sorting : " + "\n" + Arrays.toString(a));
		
	}

}
