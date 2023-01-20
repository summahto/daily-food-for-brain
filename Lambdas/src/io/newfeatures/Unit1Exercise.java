package io.newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		
		
		List <Person> people = new ArrayList<Person>();
		
		people.add(new Person("Charles", "Dickens", 60, 100));
		people.add(new Person("Lewis", "Carrol", 42, 10));
		people.add(new Person("Thomas", "Carlyle", 51, 29));
		people.add(new Person("Charlotte", "Bronte", 45, 393));
		people.add(new Person("Matthew", "Arnold", 39, 373));
		
		//1: Sort list by lastname
		Collections.sort(people, new Comparator <Person> () {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
			
		});
		
		
//		Collections.sort(people);
		
		
		//2: create a method that prints all the elements in the list
		System.out.println("printing all persons in the list: \n");
		printAll(people);
		
		//3: create a method that prints all the elements that have last name beginning with C
		System.out.println("\nprinting all persons in the list that have last name beginning with C: \n");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
			
		});
		
		
		System.out.println("\nprinting all persons in the list that have first name beginning with C: \n");
		
		
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}	
	}
}

interface Condition{
	public boolean test(Person p);
}




