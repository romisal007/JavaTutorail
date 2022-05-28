package com.test;

public class TestPattern3 {

	public static void main(String [] args) {
		
		int lines=10;
		int i,j;
		for(i=1;i<=lines;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println("");
		}
	}
}
