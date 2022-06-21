package com.equals;

import java.util.LinkedList;
import java.util.List;

public class EqualsTest {

	public static void main(String[] args) {

		String s1 = new String("Hello");
		String s2=new String("Hello");
		boolean reqEqual=(s1==s2);
		boolean  secEqual=s1.equals(s2);
		System.out.println("S1==S2 :"+reqEqual);
		System.out.println("s1.=equals(s2) :"+secEqual);
		
		Student student1 = new Student("123", "Rohit", 26);
		Student student2 = new Student("123", "Rohit", 26);
		Student student3 = new Student("456", "Peter", 23);
		
		System.out.println("Student1==Student2 :" + (student1==student2));
		System.out.println("student1.equals(student2) :"+student1.equals(student2));
		System.out.println("student1.equals(student3) :"+student1.equals(student3));

		List<Student> slist=new LinkedList<Student>();
		slist.add(student1);
		slist.add(student2);
		slist.add(student3);
	
		Student searchS1=new Student("123");
		Student searchS2=new Student("789");
		boolean found1=slist.contains(searchS1);
		boolean founds2=slist.contains(searchS2);
		System.out.println("Found 123 ?:"+found1);
		System.out.println("Found 789 ?:"+founds2);
//equal makes code simpler because to search we required to write following code  in studentclass
		/*
		 * public boolean searchStudent(List<Student> listStudents, String id) { for
		 * (Student student : listStudents) { if (student.getId().equals(id)) { return
		 * true; } }
		 * 
		 * return false; }
		 */
		
		System.out.println("Found 123:"+searchS1.searchStudent(slist, "123"));
	}
	
}
