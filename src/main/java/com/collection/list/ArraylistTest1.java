package com.collection.list;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistTest1 {

	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Rohit");
		alist.add("Balu");
		alist.add("Appa");
		alist.add("Aai");
		alist.add("Swati");
		alist.add("Aarti");
		Collections.sort(alist);

		for (String a : alist) {
			System.out.println(a);
		}

		System.out.println();
		alist.remove("Aarti");
		for (String a : alist) {
			System.out.println(a);
		}
		System.out.println();
		System.out.println(alist.get(3));

		try {

			FileOutputStream fos = new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(alist);
			fos.close();
			oos.close();

			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list = (ArrayList) ois.readObject();
			System.out.println(list);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
