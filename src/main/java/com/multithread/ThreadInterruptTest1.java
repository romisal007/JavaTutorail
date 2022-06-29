package com.multithread;

public class ThreadInterruptTest1 implements Runnable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadInterruptTest1());
		t1.start();
		try {
			Thread.sleep(5000);
			t1.interrupt();
		} catch (InterruptedException e) {
			// Do nothing
		}

	}

	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			System.out.println("This is Thread :" + i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("I'm resumed");
				continue;   // return instead of continue  means thread terminate and goes into dead state
			}
		}
	}

}
