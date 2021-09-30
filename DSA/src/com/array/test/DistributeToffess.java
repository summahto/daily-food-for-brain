package com.array.test;

import java.util.Arrays;

public class DistributeToffess {
	
	//Distribute toffees among children such that 
	//N -> no. of toffees
	//K -> no. of students
	//1st student gets 1, 2nd student gets 2 and so on till kth student, once every student is complete toffees would be
	// sent to 1st student again and continue.
	
	public static void main(String[] args) {
	
		int n = 18;
		int k = 4;
		
		int a [] = distribute(n,k);
		
		System.out.println("Distributed toffees for students are " + Arrays.toString(a));

	}
	
	private static int [] distribute(int n, int k) {
		int children [] = new int[k];
		int si = 0;
		int tj = 1;
		
		while (n > 0) {
			if(si < k && tj <= n) {
				children[si] += tj;
				n = n-tj;
				si++;
				tj++;
			}
			else if( si < k && tj >n) {
				children[si] += n;
				si++;
				break;
			}
			else if( si >= k && tj <= n) {
				si = 0;
				children[si] += tj;
				n= n- tj;
				si++;
				tj++;
			}
			else if( si >= k && tj > n) {
				si = 0;
				children[si] += n;
				si++;
				break;
			}
		}
		
		
		return children;
	}

	
	
	
	
	
}
