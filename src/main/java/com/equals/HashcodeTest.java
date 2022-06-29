package com.equals;

import java.util.HashSet;
import java.util.Set;

public class HashcodeTest {

	public static void main(String[] args) {
		Student student1 = new Student("123","Rohit",26);
		Student student2 = new Student("123","Rohit",26);
		Student student3 = new Student("456", "Peter", 23);
		
		Set<Student> setStudent=new HashSet<Student>();
		
		setStudent.add(student1);
		setStudent.add(student2);		
		setStudent.add(student3);

		setStudent.forEach(Student->System.out.println(Student));
		
		//At out put we get duplicate element even though set does not allow duplicate
		//this Happened because we have overridden equal() method 
		//As per rule if we override equal() we have override hashcode() also
		
		
		Employee Employee1 = new Employee("123", "Rohit", 26);
		Employee Employee2 = new Employee("123", "Rohit", 26);
		Employee Employee3 = new Employee("456", "Peter", 23);
		
		Set<Employee> setEmployee=new HashSet<Employee>();
		setEmployee.add(Employee1);
		setEmployee.add(Employee2);
		setEmployee.add(Employee3);
		
		setEmployee.forEach(Employee-> System.out.println(Employee));
		// duplicate element is removed after overridding both equal() and hashcode() method
		
	}

}
