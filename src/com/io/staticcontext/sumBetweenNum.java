package com.io.staticcontext;

public class sumBetweenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -6;
		int b = 5;
		int sum  = getSum(a,b);
		System.out.println(sum);
	}

	public static int getSum(int a, int b) {
		int sum = 0;
		if (b>a) {
			for (int i= a; i<= b; i++)
				sum+= i;
			
		} else if(b<a) {
			for(int i= b; i<= a; i++) {
				sum+= i;
			}
		}else
			return a;
		
		return sum;
		
	}
}
