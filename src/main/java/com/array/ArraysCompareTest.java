package com.array;

import java.util.Arrays;

public class ArraysCompareTest {

	public static void main(String[] args) {

		int[] num1 = {1,3,5,7,9,11,13,15,17,19};
		int[] num2= {1,3,5,7,9,11,13,15,17,19};
		int[] num3= {1,2,5,7,9,11,13,15,17,19};
		boolean isEqual1=Arrays.equals(num1, num2);
		System.out.println("Is arrays 1 2  are equal? :"+ isEqual1);
		boolean isEqual2=Arrays.equals(num1, num3);
		System.out.println("Is array 1, 3 are equal? :"+isEqual2);
		
		
		
		String[][] data1 = {
			    {"Name", "City", "Country"},
			    {"Bill", "Hawaii", "USA"},
			    {"David", "Madrid", "Spain"},
			};
			 
			String[][] data2 = {
			    {"Name", "City", "Country"},
			    {"Bill", "Hawaii", "USA"},
			    {"David", "Madrid", "Spain"},
			};
			 
			String[][] data3 = {
			    {"Name", "City", "Country"},
			    {"David", "Madrid", "Spain"},
			    {"Bill", "Hawaii", "USA"},
			};
			 
			boolean equal = Arrays.deepEquals(data1, data2);
			 
			System.out.println("data1 == data2 ? " + equal);
			 
			equal = Arrays.deepEquals(data1, data3);
			System.out.println("data1 == data3 ? " + equal);
	}

}
