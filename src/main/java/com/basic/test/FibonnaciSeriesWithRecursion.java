package com.basic.test;

public class FibonnaciSeriesWithRecursion {

	public static int a=0,b=1,c=0;
	static void printFibonnaci(int i){
		
		if(i>0) {
			
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			
			printFibonnaci(i-1);
		}
		
		
	}
	public static void main(String[] args) {

		System.out.print(a+" "+b);
	
		printFibonnaci(10);
	
	}

}
