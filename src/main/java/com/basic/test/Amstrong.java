package com.basic.test;

import java.util.Scanner;

public class Amstrong {

	 static boolean isAmstong(int n) {

		int temp = 0, digits = 0, lastno = 0, sum = 0;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}

		temp = n;
		while (temp > 0) {

			lastno = temp % 10;
			sum += (Math.pow(lastno, digits));
			temp = temp / 10;

		}
		if (sum == n) {
			return true;

		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		int num;
		System.out.print("Enter the limit: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		System.out.println("Amstring no upto " + num);
		
		for(int i=0;i<num;i++) {
			
			if(isAmstong(i)) {
				System.out.print(i+" ");
			}
		}
		
		
		
	
		
		/*
		 * for (int i = 0; i < num; i++) { if (isAmstong(num)) { System.out.print(" " +
		 * i); } }
		 */
	}

}
