package com.array;

import java.util.Arrays;

public class ArrayCopyingTest {

	public static void main(String[] args) {

		int[] array1 = { 1, 5, 7, 6, 4, 12, 8, 63, 45, 33, 10 };
		int[] arraycopy1 = Arrays.copyOf(array1, array1.length);
		int[] arrayCopy2 = Arrays.copyOf(arraycopy1, 5);
		int[] arraycopy3 = Arrays.copyOf(array1, 20);

		System.out.println("Original array : " + Arrays.toString(array1));
		System.out.println("Copy1 array1 :" + Arrays.toString(arraycopy1));
		System.out.println("copye array2 : " + Arrays.toString(arrayCopy2));
		System.out.println("copye array3 : " + Arrays.toString(arraycopy3));

		// Array of integer to array of String
		// Number[] arrayString1=Arrays.copyOf(array1, array1.length, Number[].class);
//		Number[] numbers = Arrays.copyOf(array1, array1.length, Number[].class);
//we can mot run commanted program as arry type in non generic
		// so to convert use generic
		try {
			Integer[] integers = { 16, 32, 64, 128, 256, 512 };
			Number[] numbers = Arrays.copyOf(integers, integers.length, Number[].class);
			String[] arrayString = Arrays.copyOf(integers, integers.length, String[].class);
			System.out.println("Numbers: " + Arrays.toString(numbers));
			System.out.println("Strings :" + Arrays.toString(arrayString));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//copy specifoc range of arrays
			int [] copyarray1=Arrays.copyOfRange(array1, 1, 5);
			System.out.println("Copy array :"+ Arrays.toString(copyarray1));

			//Filling Arrays Example
			
			System.out.println("Original array before fill : " + Arrays.toString(array1));
			Arrays.fill(array1, 0);
			System.out.println("Array after fill :"+ Arrays.toString(array1));
			
			//arrays to string 
			// Arrays.toString(array1) for 1D
			//for multi dimension
			String[][] person={ {"Rohit","Balu","Ram"},
								{"Shyam","raju","BauBhai"}};
			
			System.out.println("Array of person :"+person);
			System.out.println("Array to String  of 2D array  ;"+ Arrays.deepToString(person));
			}
	
	

}
