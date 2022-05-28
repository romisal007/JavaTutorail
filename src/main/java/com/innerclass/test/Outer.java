package com.innerclass.test;

public class Outer {

	private int data=30;
	class Inner{
		void msd() {
			System.out.println("Data is " +data);
		}
	}
	public static void main(String[] args) {
		
		Outer obj=new Outer();
		Outer.Inner in= obj.new Inner();
		in.msd();
	}

}
