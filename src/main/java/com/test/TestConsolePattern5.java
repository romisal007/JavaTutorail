package com.test;

public class TestConsolePattern5 {

	public static void main (String [] args ) {
		
		
		int i,j,k;
		int size=5;
		
		for(i=1;i<size+1;i++)
		{
			for(j=size;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<(2*i -1);k++ ) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
