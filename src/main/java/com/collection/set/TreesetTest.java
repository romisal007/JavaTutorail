package com.collection.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetTest {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Rohit Misal");
		ts.add("Balu Misal");
		ts.add("Aarti tapase");

		for (String string : ts) {
			System.out.println(string);
		}
		
		TreeSet<Integer> ti=new TreeSet<Integer>();
		ti.add(15);
		ti.add(20);
		ti.add(1);
		ti.add(12);
		ti.add(45);
		ti.add(78);
		ti.add(753);
		ti.add(03);
		ti.add(78);
		ti.add(044);
		
		System.out.println(ti);
		System.out.println("asda");
		for (Integer i : ti) {
			
			System.out.println(i);
		}
		
		Integer first = ti.first();
		 
		System.out.println("First element: " + first);
		 
		Integer last = ti.last();
		 
		System.out.println("Last element: " + last);
		 
		SortedSet<Integer> subSet = ti.subSet(2, 4);
		 
		System.out.println("Sub Set: " + subSet);
		 
		SortedSet<Integer> headSet = ti.headSet(5);
		 
		System.out.println("Head Set: " + headSet);
		 
		SortedSet<Integer> tailSet = ti.tailSet(5);
		 
		System.out.println("Tail Set: " + tailSet);
		 
		Comparator comparator = ti.comparator();
		 
		System.out.println("Sorted by natural ordering? " + (comparator == null));

	}
}
