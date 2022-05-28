package com.innerclass.test;

abstract class Person {
	abstract void eat();
}

public class TesAnonoymous {

	public static void main(String[] args) {

		Person p = new Person() {
			void eat() {
				System.out.println("nice Frouit");
			}
		};
		p.eat();

	}

}
