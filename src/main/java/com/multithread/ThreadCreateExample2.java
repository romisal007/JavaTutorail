package com.multithread;

public class ThreadCreateExample2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My name is :"+ Thread.currentThread().getName());
	}

	public static void main(String [] args) {
		Runnable task=new ThreadCreateExample2();
		Thread t1=new Thread(task);
		t1.start();
		System.out.println("My name is : "+ Thread.currentThread().getName());
				
	}
	
}
