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
		
		List <Integer> myList = new ArrayList<Integer>();
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		
		List <Integer> myList2 = new ArrayList<Integer>();
		
		Optional<Integer> min = myList.stream().min((x, y) -> x.compareTo(y));
		if(min.isPresent())
			System.out.println(min.get());
		
		System.out.println(myList.stream().min(Integer::compare).get());
		
		Optional<Integer> max = myList.stream().max((x,y) -> x.compareTo(y));
		if(max.isPresent()) {
			System.out.println(max.get());
		}
		
		System.out.println("Sorted List");
		myList.stream().sorted().forEach(n -> System.out.print(n + " "));
		
		System.out.println("odd numbers");
		myList.stream().filter(n -> n%2 == 1).forEach(System.out::println);
		
		System.out.println("total sum");
		int sum = myList.stream().reduce(0, (x,y) -> x+y);
		
		System.out.println(sum);
		
		
		Optional <Integer> totalSum = myList.stream().reduce((x,y) -> x+y);
		totalSum.orElse(Integer.MAX_VALUE);
		System.out.println(totalSum.get());
		
		int evenSum = myList.stream().reduce(0, (x, y) -> {
			if (y % 2 == 0)
				return x + y;
			else
				return x;
		});
		
		System.out.println(evenSum);
		
		System.out.println("printing all the numbers");
		Iterator<Integer> itr = myList.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + ", ");
	}

}
