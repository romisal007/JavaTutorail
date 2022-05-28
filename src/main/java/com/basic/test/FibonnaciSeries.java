package com.basic.test;

public class FibonnaciSeries {

	public static void main(String[] args) {
		
		int a=0,b=1;
		System.out.print(a+" "+" "+b+" ");
		int c=0;
		for(int i=1;i<10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		
	}

}
