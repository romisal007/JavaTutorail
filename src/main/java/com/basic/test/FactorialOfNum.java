package com.basic.test;

public class FactorialOfNum {

	public static void main(String[] args) {
		
		int n=0,fact=1;
		
		if(n==0) {
			fact=1;
		}
		else {
			for(int i=1;i<=n;i++){
				
				fact=fact*i;
			}
		}
		

		System.out.println(fact);
	}

}
