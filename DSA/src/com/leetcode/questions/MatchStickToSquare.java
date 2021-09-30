package com.leetcode.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MatchStickToSquare {

	public static void main(String[] args) {
		
		int arr [] = {4, 3, 4, 4, 2, 6, 1};
		
		for(int i : arr) {
			System.out.println(i);
		}
//		Boolean isSquarePossible = makeSquare(arr);
		
	}

	private static Boolean makeSquare(Integer [] matchSticks) {
		
		List<Integer> list = Arrays.asList(matchSticks);
		
		Comparator <Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
			
		};
		
		return null;
	}

}
