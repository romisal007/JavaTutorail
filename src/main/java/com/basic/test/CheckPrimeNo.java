package com.basic.test;

public class CheckPrimeNo {

	public static void main(String[] args) {
		
		
		int a=0,b=1,m=0;
		int n=6;
		m=n/2;
		boolean flag=false;
		if(n==a||n==b) {
			System.out.println(n +" is not prime no");
		}
		else {
			for(int i=2;i<=n;i++) {
				
				if(m%i==0) {
					System.out.println(n+" is not prime no");
					flag=true;
					break;
				}
				
			}
			
			if(!flag) {
				
				System.out.println(n+ " is prime NO");
			}
			
		}
		

	}

}
