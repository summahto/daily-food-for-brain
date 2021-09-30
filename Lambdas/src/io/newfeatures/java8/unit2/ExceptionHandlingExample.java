package io.newfeatures.java8.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		int [] someNumbers = {1, 2, 3, 4};
		int key = 2; 
		process(someNumbers, key, wrapperLambda((v, k)-> System.out.println(v/k)));

	}

	private static void process(int[] someNumbers, int k, BiConsumer <Integer, Integer> consumer) {
		for(int n : someNumbers) {
			
			consumer.accept(n,k);
		}
	}
	
	public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer ) {
		return consumer;
	}

}
