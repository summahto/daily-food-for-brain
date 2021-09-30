package io.newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseJava8 {

	public static void main(String[] args) {
		
		
		List <Person> people = new ArrayList<Person>();
		
		people.add(new Person("Charles", "Dickens", 60));
		people.add(new Person("Lewis", "Carrol", 42));
		people.add(new Person("Thomas", "Carlyle", 51));
		people.add(new Person("Charlotte", "Bronte", 45));
		people.add(new Person("Matthew", "Arnold", 39));
		
		//1: Sort list by lastname
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		
//		Collections.sort(people);
		
		
		//2: create a method that prints all the elements in the list
		System.out.println("printing all persons in the list: \n");
//		printAll(people);
		printConditionally(people, p -> true);
		
		//3: create a method that prints all the elements that have last name beginning with C
		System.out.println("\nprinting all persons in the list that have last name beginning with C: \n");
		printConditionally(people, p -> p.getLastName().startsWith("C"));
		
		
		System.out.println("\nprinting all persons in the list that have first name beginning with C: \n");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for(Person p : people) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
	}

}






