package com.array.test;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		int [] original = new int [] {8,3,4,1,8,9,3,7,7,4,0,0} ;
		int [] target = new int[original.length];
		
		System.out.println("Target array before checking");
		for(int i : target)
			System.out.print(target[i] + ", ");
			
		int k = 0;
		
		for(int i=0; i<original.length ;i++) {
			boolean found = false;
			
			for(int j=0; j<=k; j++) {
				if (target[j] == original[i]) {
					found = true;
					break;
				}
				
			}
			
			if(found == false) {
				target[k] = original[i];
				k++;
			}
		}
		
		System.out.println("\nTarget array before checking");
		for(int i=0 ; i<k ; i++)
			System.out.print(target[i] + ", ");
		
		
	}

}
