package com.multithread;

public class NumPrintEvery2Sec implements Runnable {

	public static void main(String[] args) {
		Runnable task=new NumPrintEvery2Sec();
		Thread t1=new Thread(task);
		t1.start();
	System.out.println("Main thread Terminated");
		
	}

	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("I am iteruppeted");
				e.printStackTrace();
			}

		}
		System.out.println("THread terminated :"+ Thread.currentThread().getName());

	}

}
