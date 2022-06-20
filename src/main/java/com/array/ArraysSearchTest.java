package com.array;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchTest {

	public static void main(String[] args) {

		int[] num1 = { 45, 12, 20, 10, 7, 96, 5, 49 };
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
		int index = Arrays.binarySearch(num1, 12);
		System.out.println("NO 12 is found at :" + index);
		int index2 = Arrays.binarySearch(num1, 7);
		if (index2 >= 0) {
			System.out.println("Searched no present in array At index :" + index2);
		} else {
			System.out.println("No is not present in array");
		}

		System.out.println();
		Student[] stud = new Student[4];
		stud[1] = new Student("Rohit",26);
		stud[0] = new Student("Balu", 30);
		stud[2] = new Student("Shyam", 15);
		stud[3] = new Student("Aarti", 18);

		
		Arrays.sort(stud, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("Student after sorting :" + Arrays.toString(stud));

		Student studToFind = new Student("Rohit");
	
		int studIndex = Arrays.binarySearch(stud, studToFind);
		if (studIndex >= 0) {
			System.out.println("Student is present intdex is :" + studIndex);
		} else {
			System.out.println("Student is not preset ");
		}

	}
}
