package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ListExamples {

	public static void main(String[] args) {


//		Basic List operations: adding, retrieving, updating, removing elements
	
		List<String> listString=new ArrayList<String>();
		listString.add("Rohit");
		listString.add("Balu");
		listString.add("Aarti");
		System.out.println(listString);
		
		//Adding elements of sub types of the declared type
		List<Number> listNumber=new ArrayList<Number>();
		listNumber.add(new Integer(100));
		listNumber.add(new Double(12.12));
		listNumber.add(new Float(3.14));
		listNumber.add(new Long(2257568));
		System.out.println(listNumber);
		
		//The constructor Integer(int) is deprecated since version 9
		List<Number> listNumber2=new ArrayList<Number>();

		listNumber2.add(100);
		listNumber2.add(12.12);
		listNumber2.add(3.14);
		listNumber2.add(2257568);
		System.out.println(listNumber2);
		
		//Retrieving elements from a List
		String element = listString.get(2);
		Number number = listNumber.get(3);

		System.out.println(element + "   "+ "  "+number);
		
		//updateing list
		listString.set(2, "Hi");
		System.out.println(listString);
		//removing
		listString.remove(2);
		System.out.println(listString);
		
		//To remove all elements in the list, use the clear() method:
		
		listString.add(element);
//
		//Iterating over elements in a list

		for(String s:listString) {
			System.out.println(s);
		}
		
		//Using iterator
		Iterator<String> itr=listString.iterator();
		
		 	while(itr.hasNext()) {
		 		System.out.println(itr.next());
		 	} 
		 	//from java 8 onward we can use
		listString.forEach(s -> System.out.println(s)); 	
		
		
		//Searching for an element in a list
		
		if(listString.contains("Rohit")) {
			System.out.println("found the element");
		}
		else {
			System.out.println("there is no such elemnt");
		}
		
		// Sorting a list
		
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("D");
		listStrings.add("C");
		listStrings.add("E");
		listStrings.add("A");
		listStrings.add("B");
		System.out.println("listStrings before sorting: " + listStrings);
	//	Collections.sort(listStrings);
		System.out.println("listStrings after sorting: " + listStrings);
	//listStrings.sort(null); sort list in natural order
		
		//Copying elements from one list into another
		List<String> sourceList = new ArrayList<String>();
		sourceList.add("A");
		sourceList.add("B");
		sourceList.add("C");
		sourceList.add("D");
		List<String> destList = new ArrayList<String>();
		destList.add("V");
		destList.add("W");
		destList.add("X");
		destList.add("Y");
		destList.add("Z");
		System.out.println("destList before copy: " + destList);
		Collections.copy(destList, sourceList);
		System.out.println("destList after copy: " + destList);
		
		
		
		// Shuffling elements in a list
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) numbers.add(i);
		System.out.println("List before shuffling: " + numbers);
		Collections.shuffle(numbers);
		System.out.println("List after shuffling: " + numbers);

		//Reversing elements in a list
		List<Integer> numbers1 = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) numbers1.add(i);
		System.out.println("List before reversing: " + numbers1);
		Collections.reverse(numbers1);
		System.out.println("List after reversing: " + numbers1);
	
//Extracting a portion of a list
		
		List<String> listNames = Arrays.asList("Ram", "shyam", "Raju", "Gita", "Meena", "laxmi");
		System.out.println("Original list: " + listNames);
		List<String> subList = listNames.subList(2, 5);
		System.out.println("Sub list: " + subList);
	}
	

}
