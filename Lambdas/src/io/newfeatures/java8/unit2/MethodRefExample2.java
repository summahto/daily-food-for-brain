package io.newfeatures.java8.unit2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.newfeatures.Person;

public class MethodRefExample2 {

	public static void main(String[] args) {
		
		
		List <Person> people = new ArrayList<Person>();

		people.add(new Person("Charles", "Dickens", 60, 100));
		people.add(new Person("Lewis", "Carrol", 42, 10));
		people.add(new Person("Thomas", "Carlyle", 51, 29));
		people.add(new Person("Charlotte", "Bronte", 45, 393));
		people.add(new Person("Matthew", "Arnold", 39, 373));
		
		
		performConditionally(people, p -> true, System.out::println); //p -> method(p)
		//how does java know that System.out::println needs an input argument
		//since its taking a place of a consumer, which needs an argument
		
		
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : people) {
			if(predicate.test(p)) {
				consumer.accept(p);;
			}
		}
		
	}


}
