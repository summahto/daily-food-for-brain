package com.test;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		
		int [][] arr = {{7,8,9},
					  {0,0,0}};

		int a = Integer.MAX_VALUE;
//		reshape(arr, 3, 2);j

		byte b;
		 
        // Declaring and initializing integer and double
        int i = 383;
        double d = 511.142;
 
        // Display message
        System.out.println("Conversion of int to byte.");
 
        // i % 256
        b = (byte)i;
 
        // Print commands
        System.out.println("i = " + i + " b = " + b);
        System.out.println(
            "\nConversion of double to byte.");
 
        // d % 256
        b = (byte)d;
 
        // Print commands
        System.out.println("d = " + d + " b= " + b);
        
        int m = 257;
        double n = 4.142;
        System.out.println(m % 128);
        System.out.println((int) n % 128);
        

    }

private static void reshape(int[][] arr, int r, int c) {
		int m = arr.length, n = arr[0].length; 
		int [][] res = new int[r][c]; 
		for(int i =0 ; i< r*c; i++) {
			System.out.println(i/c + "," +i%c + " ->" + i/n + "," + i%n );
		}
		
	
	}

public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(m == 0 && n == 0)
            return;
        
        if(m == 0){
            for(int i=0; i<n ;i++)
                nums1[i] = nums2[i];
            
            return;
        }
        
        if(n == 0)
            return;
            
        int merged [] = new int [m+n];
        int i=0, j =0, k = 0;
        
        while(i< m+n){
            if(j< m && k< n){
                if(nums1[j] <= nums2[k]){
                    merged[i] = nums1[j];
                    j++; i++;
                }else{
                    merged[i] = nums2[k];
                    k++; i++;
                }          
            }else {
            	break;
            }
            System.out.println(i + " "  + j + " " + k + " ");
            
        }
            
            while(j< m){
                merged[i] = nums1[j];
                j++;
                i++;
            }
            
            while(k<n){
                merged[i] = nums2[k];
                k++;
                i++;
            }
        
        
        
//        for(int a=0 ; a< m+n ; a++){
//            nums1[a] = merged[a];
//            
//        }
           
        
        for(int num : merged)
        System.out.print(num + " ");
    }
}
