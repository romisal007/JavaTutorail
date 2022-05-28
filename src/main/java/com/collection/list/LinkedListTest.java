package com.collection.list;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<Book> blist=new LinkedList<Book>();
		Book b1=new Book(1, "let us c", "yashwant kanetkar", 200);
		Book b2 =new Book(2, "Java black book", "unknown",800);
		 Book b3=new Book(3,"Operating System","Galvin",600);  
		 blist.add(b1);
		 blist.add(b2);
		 blist.add(b3);
		 
		 for(Book b:blist) {
			 
			 System.out.println(b.toString());
		 }
	}

}
