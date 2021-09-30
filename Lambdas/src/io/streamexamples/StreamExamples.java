package io.streamexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
 		
		people.add(new Person("Charles", "Dickens", 60));
		people.add(new Person("Lewis", "Carrol", 42));
		people.add(new Person("Thomas", "Carlyle", 51));
		people.add(new Person("Charlotte", "Bronte", 45));
		people.add(new Person("Matthew", "Arnold", 39));
		
		
		List <Person> peopleFnameC = people.stream()
										.filter(p -> p.getFirstName().startsWith("C"))
											.collect(Collectors.toList());
		int sum = 0;
		System.out.println(people.stream().collect(Collectors.summarizingInt(p -> p.getAge())).getSum());
		
		IntStream.range(1, 10)
			.forEach(System.out::println);
	
	}

}
