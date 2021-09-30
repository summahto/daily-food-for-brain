package io.newfeatures.java8.unit2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.newfeatures.Person;

public class CollectionIterExample {

	public static void main(String[] args) {
		
		List <Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		System.out.println("using for loop");
		
		for (int i = 0; i<people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("using for-in loop");
		
		for(Person p : people) {
			System.out.println(p);
		}
		
		System.out.println("using lambda for each");
		people.forEach(System.out::println);
	}

}
