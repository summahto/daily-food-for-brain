package com.array.test;

import java.util.Arrays;

public class TestingArraysClass {

	public static void main(String[] args) {
		
		int a [] = {8,3,4,1,8,9,3,7,7,4,0,0};
		
		Arrays.fill(a, 5, 9, 90);
		
		for(int i:a)
		System.out.print(i + " ");
	}

}
