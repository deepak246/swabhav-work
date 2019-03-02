package com.techlabs.treeset;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>();

		// Elements are added using add() method
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");
		ts1.add("D");

		// Duplicates will not get insert
		ts1.add("C");

		// Elements get stored in default natural
		// Sorting Order(Ascending)
		System.out.println(ts1);

		// Elements are removed using remove() method
		ts1.remove("B");

		// Traversing elements
		Iterator<String> itr = ts1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
