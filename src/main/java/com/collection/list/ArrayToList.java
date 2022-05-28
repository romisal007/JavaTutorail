package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[]arg) {
		String[] array={"java","python","C++","SQL"};
		
		System.out.println("Printig array "+ Arrays.toString(array) );
		List<String> list=new ArrayList<String>();
		for(String s:array) {
			list.add(s);
		}
		System.out.println(list);
		
		
	}
}
