package io.streamexamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(3);
//		myList.add(24);
//		myList.add(91);
//		myList.add(29);
//		myList.add(17);
//		myList.add(5);

		List<Integer> myList2 = new ArrayList<Integer>();
		
		
		//passing the comparator myself
		Optional<Integer> min = myList.stream().min((x, y) -> x.compareTo(y));
		if (min.isPresent()) {
			System.out.println("Minimum value : " + min.get());
		}
		
		//using the default implementation of Integer.compare method as shown below
		
		/*public static int compare(int x, int y) {
			return (x < y) ? -1 : ((x == y) ? 0 : 1);
		}
		*/
		Optional<Integer> max = myList.stream().max(Integer::compare);
		if (max.isPresent())
			System.out.println("Maximum value : " + max.get());
		
		//returns sorted list by natural order
		myList.stream().sorted().forEach(n -> System.out.print(n + " "));
		
		System.out.println("\nOdd values greater than 5");
		
		myList.stream().sorted().filter(n -> n%2 == 1 && n> 5).forEach(x -> System.out.print(x + " "));
		
		long count = myList.stream().count();
		System.out.println("\nTotal Number of elements :" + count);
		
		myList.stream().reduce((x,y) -> x+y).ifPresent(System.out:: println);
		
		
		//Reduction operations, passing BinaryOperator to the reduce method
		Optional<Integer> product = myList.stream().reduce((x,y) -> x*y);
		if(product.isPresent())
			System.out.println("product : " + product.get());
		
		//Reduction using Identity value - it is a value which would give the same value if any element would operate 
		//on this identity value
		//***T apply(T val, T val2) => val(contains the previous result, accumulating variable) , val2 (next value)***
		
		Integer sumUsingIdentity = myList.stream().reduce(0, (x,y) -> x+y);
		System.out.println("sum using Identity in reduce function: " + sumUsingIdentity);
		
		//find sum of only even numbers
		
		System.out.println("Finding sum for only even numbers");
		myList.stream().reduce((a,b) -> {
			if(b%2 ==0) return a+b;
			else return a;
		}).ifPresent(System.out::println);
		
		
		List<Double> listDouble = new ArrayList<Double>();
		listDouble.add(64.0);
		listDouble.add(4.0);
//		listDouble.add(8.0);
		listDouble.add(16.0);
		
		
		//two different versions of reduce method
		Double reduceProdSqRoot = listDouble.stream().reduce(1.0, (a,b) -> a * Math.sqrt(b));
		System.out.println("Product of Square Roots : " + reduceProdSqRoot );
		
		
	
	}

}
