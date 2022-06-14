package com.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDequeueTest2 {

	public static void main(String[] args) {

		Deque<String> dqueueName = new ArrayDeque<String>();
		dqueueName.add("Rohit");
		dqueueName.add("Ram");
		dqueueName.offer("Shyam");
		dqueueName.addFirst("Raju");
		dqueueName.addLast("Baburao");
		System.out.println(dqueueName);

		Queue<String> queueCustomers = new PriorityQueue<>();

		queueCustomers.offer("Jack");
		try {

			System.out.println("who's next: " + queueCustomers.poll());

			// this returns null in case the queue is empty
			System.out.println("who's next: " + queueCustomers.peek());

			// this throws exception in case the queue is empty
			System.out.println("who's next: " + queueCustomers.element());

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		Deque<Integer> queueNumbers = new ArrayDeque<>();
		 
		queueNumbers.add(10);
		queueNumbers.add(20);
		queueNumbers.add(30);
		queueNumbers.add(40);
		 
		System.out.println("first: " + queueNumbers.getFirst());
		System.out.println("last: " + queueNumbers.peekLast());

		
		/*
		 * BlockingQueue<String> queueCustomers = new ArrayBlockingQueue<>(10000);
		 * 
		 * queueCustomers.offer("Kathe");
		 * 
		 * try { String nextCustomer = queueCustomers.take();
		 * System.out.println(nextCustomer); } catch (InterruptedException ie) {
		 * ie.printStackTrace(); } queueCustomers.add("bob");
		 * System.out.println(queueCustomers);
		 */

	}

}
