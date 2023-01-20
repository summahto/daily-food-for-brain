package com.array.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class TestingArraysClass {

	public static void main(String[] args) {

		double ulp = Math.ulp(Double.MAX_VALUE);
		System.out.println(ulp);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MAX_VALUE + ulp / 2.0000000001);

		System.out.println(Double.MAX_VALUE + ulp / 2);

		HashMap<Integer, String> testMap = new HashMap<>();
		testMap.put(1, "one");
		testMap.put(2, "two");
		testMap.put(3, "three");

		System.out.println(testMap.get(1));

//		System.out.println(~5); //need to check how this works
//		Random r = new Random();
//		for (int i= 0 ; i< 10 ; i++) {
//			System.out.println(r.nextFloat());
//		}
//		System.out.println(generateRandomString());
	}

	public static String generateRandomString() {
		String charsList = "abcdefghijklmnopqrstuvwxyz123456789";
		StringBuilder buffer = new StringBuilder();
		Random random = new Random();

		while(buffer.length() <= 9){
			int index =  (int) (random.nextFloat() * charsList.length());
			System.out.println(index);
			buffer.append(charsList.charAt(index));
		}

		return buffer.toString();

	}
}
