package com.equals;

public class Employee {

	private String id;
	private String name;
	private int age;

	public Employee(String id) {
        this.id = id;
    }
 
	public Employee(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee another = (Employee) obj;
			if (this.id.equals(another.id)) {
				return true;
			}
		}

		return false;
	}

	public int hashCode() {
	    return 31 + id.hashCode();
	}
}
