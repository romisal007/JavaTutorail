package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args) {

		//Adding elements to a Set
		Set<String> names=new HashSet<String>();
		names.add("Rohit");
		names.add("Balu");
		names.add("Aarti");
		System.out.println(names);

		if(names.add("Gita")) {
			System.out.println("Gita is added to set ");
		}
		if(!names.add("Rohit")) {
			System.out.println("Rohit is already in the Set");
		}
		names.add(null);
		System.out.println(names);


		if(names.add("Gita")) {
			System.out.println("Gita is added to set ");
		}
		else {
			System.out.println("Gita is already in the Set");

		}
		
		//getting total no of elements
		
		System.out.printf("The set has %d elements", names.size());  // null is  also counting as element
		System.out.println();
		
		
		for (String name : names) {
		    System.out.println(name);
		}
		
		names.forEach(System.out::println);
		
		// Searching for an element in a Set
		
		if (names.contains("Rohit")) {
		    System.out.println("Found Rohit");
		}else {
			System.out.println("Rohit is  not found");
		}
		
		
		//Remove all elements from a Set
		
		names.clear();
		 
		if (names.isEmpty()) {
		    System.out.println("The set is empty");
		}
	}

}
