package com.equals;

import java.util.List;

public class Student {

	private String id;
	private String name;
	private int age;

	public Student(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	
	
	public Student(String id) {
		super();
		this.id = id;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * public boolean equals(Object obj) { if (obj instanceof Student) { Student
	 * another = (Student) obj; if (this.id.equals(another.id) &&
	 * this.name.equals(another.name) && this.age == another.age) { return true; } }
	 * 
	 * return false; }
	 */
	public boolean equals(Object obj) {
	    if (obj instanceof Student) {
	        Student another = (Student) obj;
	        if (this.id.equals(another.id)) {
	                return true;
	        }
	    }
	 
	    return false;
	}
	
	public boolean searchStudent(List<Student> listStudents, String id) {
	    for (Student student : listStudents) {
	        if (student.getId().equals(id)) {
	            return true;
	        }
	    }
	 
	    return false;
	}


}
