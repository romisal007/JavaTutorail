package com.array;

public class Employees implements Comparable<Employees> {

	private String name;
	private int age;
	private int salary;

	public Employees(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "Employees [name=" + name + ", age=" + age + ", salary=" + salary + "]";
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employees o1) {
		return this.age - o1.age;
	}

	
}
