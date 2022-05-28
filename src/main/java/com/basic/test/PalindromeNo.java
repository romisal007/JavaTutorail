package com.basic.test;

public class PalindromeNo {

	public static void main(String[] args) {

		int a = 0, sum = 0;
		int n = 48984;
		int temp = 0;
		temp = n;
		while (n > 0) {
			a = n % 10;
			sum = sum * 10 + a;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is palindrome");
		} else {
			System.out.println(temp + " is not palindrome");
		}
	}

}
