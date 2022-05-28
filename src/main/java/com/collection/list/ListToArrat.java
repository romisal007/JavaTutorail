package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrat {

	public static void main(String[] args) {

		List<String> alist = new ArrayList<String>();
		alist.add("Rohit");
		alist.add("Balu");
		alist.add("Appa");
		alist.add("Aai");
		alist.add("Swati");
		alist.add("Aarti");
		
		String[] array=alist.toArray(new String[alist.size()]);

		System.out.println(Arrays.toString(array));
		
	}

}
