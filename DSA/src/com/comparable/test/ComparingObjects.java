package com.comparable.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparingObjects {
	
	public static void main (String[] args) {
		
		List <Laptop> laptopList = new ArrayList<Laptop>();
		List <Laptop> laptopList2 = new ArrayList<Laptop>();
		
		
		laptopList.add(new Laptop("HP","envy1", 8, 30000));
		laptopList.add(new Laptop("Dell","inspiron1", 12, 50000));
		laptopList.add(new Laptop("Apple", "mac1",6, 80000));
		laptopList.add(new Laptop("Acer", "life1",16, 70000));

		laptopList2.add(new Laptop("HP","envy2",10, 40000));
		laptopList2.add(new Laptop("Dell","inspiron2", 12, 60000));
		laptopList2.add(new Laptop("Apple", "mac2",6, 90000));
		laptopList2.add(new Laptop("Acer", "life2",16, 80000));
		
		
		Comparator <Laptop> comp = new Comparator<Laptop> () {

			public int compare(Laptop l1, Laptop l2) {
				if(l1.getBrand().compareTo(l2.getBrand()) == 0) {
					return l1.getModel().compareTo(l2.getModel());
				}
				else
					return l1.getBrand().compareTo(l2.getBrand());
					
			}
		};
		
//		Collections.sort(laptopList);
//		Collections.sort(laptopList, comp);
		
		//passing comparator to the sorted method
		laptopList.stream().
				sorted((l1, l2) -> Integer.compare(l1.getPrice(), l2.getPrice())).
				forEach(System.out::println);
		
//		
//		for(Laptop laptop : laptopList) {
//			System.out.println(laptop);
//		}
		
	}
}
