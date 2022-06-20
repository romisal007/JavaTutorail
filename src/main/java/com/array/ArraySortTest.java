package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySortTest {

	public static void main(String[] args) {

		int[] num1 = { 1, 4, 8, 3, 1, 75, 2, 98, 100, 25 };
		int[]num2=Arrays.copyOf(num1, num1.length);
		System.out.println("Before sorting array :" + Arrays.toString(num1));
		Arrays.sort(num1);
		System.out.println("After sorting array is :" + Arrays.toString(num1));
		
		
		Arrays.sort(num2,0,5);
		System.out.println(Arrays.toString(num2));
		
		System.out.println();
		Employees[] emp = new Employees[4];
		emp[1] = new Employees("Rohit", 26, 30000);
		emp[0] = new Employees("balu", 30, 45000);
		emp[2] = new Employees("Shyam", 45, 10000);
		emp[3] = new Employees("Shyam", 21, 15000);
		Employees[] emp2copy = Arrays.copyOf(emp, emp.length);
		System.out.println("***-----------sorting using Age Comparable interface  compareto method----------******");
		System.out.println("Emp Details before sorting uing age :" + Arrays.toString(emp));

		Arrays.sort(emp);
		System.out.println("Emp after age Soting : " + Arrays.toString(emp));

		System.out.println();
	
		System.out.println(
				"***----------------EmpSalaryComparato implements Comparator interface, compare method  using salay parameter-------------****");
		System.out.println("Before sorting :" + Arrays.toString(emp2copy));
		Arrays.sort(emp2copy, new EmpSalaryComparator());

		System.out.println("After soring using salary :" + Arrays.toString(emp2copy));
		System.out.println();
		// Revers sorting
		System.out.println("***-------------Arrays reverse ordering----------------******");
		String[] fruits = { "Mango", "Banana", "Apple", "Orange", "Grapes", "Lemon" };
		Arrays.sort(fruits);
		System.out.println("Alohabetical order :" + Arrays.toString(fruits));
		Arrays.sort(fruits, Collections.reverseOrder());
		System.out.println("Reverse Order :" + Arrays.toString(fruits));

		System.out.println("***----Reverse oredering salary_---****");
		Comparator<Employees> descendingSalaryComparator = Collections.reverseOrder(new EmpSalaryComparator());
		Arrays.sort(emp2copy,descendingSalaryComparator);
		System.out.println("Sorting by descending order based on salary :"+Arrays.toString(emp2copy));
	}

}
