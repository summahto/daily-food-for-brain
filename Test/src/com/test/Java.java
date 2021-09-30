package com.test;

import java.util.*;


public class Java {
	
	
	public static void main(String[] args) {
		
		Map<Integer, String> names = new LinkedHashMap<>();
		
		names.put(1, "ABC");
		names.put(2, "DEF");
		
		names.put(4, "JKL");
		names.put(3, "GHI");
		names.put(5, "MNO");
		
		
		
//		for(Map.Entry entry : names.entrySet()) {
//			
//			System.out.print(entry.getValue() + " ");
//		}
		
		List<String> duplicateList = new ArrayList<String>();
		duplicateList.add("A");
		duplicateList.add("A");
		duplicateList.add("A");
		duplicateList.add("A");
		duplicateList.add("A");
		
		
		HashSet<String> test = new HashSet<>(duplicateList);
		
		Iterator itr = test.iterator();
		  
        // check element is present or not. if not loop will
        // break.
        while (itr.hasNext()) {
            System.out.println(itr.next());
	}

}}
