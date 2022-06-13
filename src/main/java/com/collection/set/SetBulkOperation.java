package com.collection.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetBulkOperation {

	public static void main(String[] args) {
		// Performing Bulk Operations between two Sets

		// Subset operation:
		Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(1, 3, 5, 7, 9));
		Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(3, 5));

		if (s1.containsAll(s2)) {
			System.out.println("s2 is subset of s1");
		} else {
			System.out.println("s2 is not subset of s1");

		}

		// Union operation:
		Set<Integer> s3 = new HashSet<Integer>(Arrays.asList(2, 4, 6, 8));
		s1.addAll(s3);
		System.out.println(s1);
		
		// Intersection operation:
		Set<Integer> s4 = new HashSet<Integer>(Arrays.asList(1, 3, 5, 7, 9));
		Set<Integer> s5 = new HashSet<>(Arrays.asList(2, 3, 4, 5, 7));
		System.out.println("S4 before intersection " + s4);
		s4.retainAll(s5);
		System.out.println("S4 after intersection " + s4);

		
		/*All three implementations HashSet, LinkedHashSet and TreeSet are not synchronized.
		 * So if you use them in concurrent context (multi-threads), you have to synchronize
		 *  them externally using Collections.synchronizedSet() static method.
		 * */
		Set<Integer> numbers = Collections.synchronizedSet(new HashSet<Integer>(Arrays.asList(1, 3, 5, 7, 9)));
		synchronized (numbers) {
		    Iterator<Integer> iterator = numbers.iterator();
		 
		    while (iterator.hasNext()) {
		        Integer number = iterator.next();
		        System.out.println(number);
		    }
		}
	}

}
