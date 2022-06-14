package com.collection.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDequeueTest1 {

	public static void main(String[] args) {

		List<String> listNames = Arrays.asList("Alice", "Bob", "Martin", "jenny", "Sam", "Michel");
		Queue<String> queuenames = new LinkedList<String>(listNames);
		System.out.println(queuenames);

		queuenames.add("Mery");
		queuenames.add("John");
		System.out.println(queuenames);

		// boundede queue
		Queue<Integer> queueNumbers = new ArrayBlockingQueue<Integer>(3);
		queueNumbers.add(15);
		queueNumbers.add(1);
		queueNumbers.add(20);

		System.out.println(queueNumbers);
		try {
			queueNumbers.add(10); // throws exception java.lang.IllegalStateException: Queue full . as queue size
									// is 3

		} catch (Exception e) {
			e.printStackTrace();
		}

		Queue<Integer> queueNumbers2 = new ArrayBlockingQueue<Integer>(3);
		System.out.println(queueNumbers2.offer(5));
		System.out.println(queueNumbers2.offer(7));
		System.out.println(queueNumbers2.offer(36));
		System.out.println(queueNumbers2.offer(54));
		System.out.println(queueNumbers2.offer(72));

		System.out.println(queueNumbers2);

		//removing
		
		String next=queuenames.remove();
		System.out.println("Next Name is "+next);
		next = queuenames.remove();  //it throws exception if there is no element in queue
		
		System.out.println(next); 
		System.out.println("next: " + queuenames.poll());  //it return s null if there is no  element in queue
		
	}

}
