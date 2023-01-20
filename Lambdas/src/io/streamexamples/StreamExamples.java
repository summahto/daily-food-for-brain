package io.streamexamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.newfeatures.Person;

public class StreamExamples {

	public static void main(String[] args) {
		
		
List <Person> people = new ArrayList<Person>();
List <String> strList = new ArrayList<>();	
		strList.add("amit");
		
		String strArr [] = new String [10];
 		Object objArr [] = new Object [20];
 		
 		objArr = strArr; //
// 		ArrayList<String> strings = new ArrayList<Object>();
// 		ArrayList<Object> objects = new ArrayList<String>();
 		
 		Object[] objects = new String[1];
 		
		people.add(new Person("Charles", "Dickens", 60, 10000));
		people.add(new Person("Charles", "Dickens", 60, 40000));
		people.add(new Person("Lewis", "Carrol", 42, 50000));
		people.add(new Person("Thomas", "Carlyle", 51, 60000));
		people.add(new Person("Charlotte", "Bronte", 45, 70000));
		people.add(new Person("Matthew", "Arnold", 39, 25000));
		people.add(new Person("Matthew", "Arnold", 39, 45000));
		
		
		List <Person> peopleFnameC = people.stream()
										.filter(p -> p.getFirstName().startsWith("C"))
											.collect(Collectors.toList());
		int sum = 0;
		System.out.println(people.stream().collect(Collectors.summarizingInt(p -> p.getAge())).getSum());
		
		ArrayList<Person> uniqueList = people.stream().
		collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparingInt(Person::getAge))),
				ArrayList::new));
		uniqueList.stream().mapToInt(p -> p.getAge()).reduce((x,y) -> x+y).ifPresent(System.out::println);
		
		people.stream().map(p -> p.getAge()).reduce((x,y)-> x+y).ifPresent(System.out::println);	
//		uniqueList.forEach(System.out::println);
		
		
		
		people.stream().filter(StreamExamples.distinctByKey(p -> p.getAge())).forEach(System.out::println);
		
//		Map<String, Integer> mapNameAge = 
//				people.stream().
//					filter(p -> !p.getFirstName().isBlank()).
//						collect(Collectors.toMap( p -> p.getFirstName(), p -> p.getAge()));
		
		
//		System.out.println(mapNameAge);
		
		String [][] array = new String[][] {{"a","b"}, {"c","d"}, {"f","g"}};
		Stream<String[]> stream1 = Stream.of(array);
		List<String> strlist =	stream1
				.flatMap(x -> Stream.of(x))
				.filter(s -> !s.equals("a"))
				.collect(Collectors.toList());
		
		strlist.forEach(System.out::println);
		
		
		
		
		
	}
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) 
	{
	    Map<Object, Boolean> map = new ConcurrentHashMap<>();
	    
	    return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
	
	


}
