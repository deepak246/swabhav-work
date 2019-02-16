package com.techlabs.arraylist;

import java.util.*;

public class GenericDemo {

	public static void main(String[] args) {
		// Creating a an ArrayList with String specified
		ArrayList<String> al = new ArrayList<String>();

		al.add("Sachin");
		al.add("Rahul");

		// Compiler doesn't allow this
		// al.add(10);

		// No typecasting needed
		String s1 = al.get(0);
		String s2 = al.get(1);
		// String s3 = (String)al.get(2);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
