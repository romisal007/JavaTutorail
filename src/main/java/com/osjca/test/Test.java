package com.osjca.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float f=10.0f;
		System.out.println(f);

		long l= 1_23_4560l;
		System.out.println(l);
		char ch=0XfFFF;
		System.out.println(ch);
		
		
		double[][] x= new double[3][3];
		System.out.println(x.getClass().getName());
		
		int[] xv=new int[-3];
		System.out.println(xv);
		
	}

}
