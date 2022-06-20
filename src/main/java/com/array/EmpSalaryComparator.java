package com.array;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		return o1.getSalary()- o2.getSalary();
	}

}
