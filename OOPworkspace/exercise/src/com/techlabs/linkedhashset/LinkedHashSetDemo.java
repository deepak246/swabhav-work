package com.techlabs.linkedhashset;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

		// Adding element to LinkedHashSet using add() method
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");

		// This will not add new element as A already exists
		linkedset.add("A");
		linkedset.add("E");

		System.out.println("Size of LinkedHashSet = " + linkedset.size());
		System.out.println("Original LinkedHashSet:" + linkedset);
		System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));
		System.out.println("Removing Z which isn't present: " + linkedset.remove("Z"));
		System.out.println("Checking if A is present=" + linkedset.contains("A"));
		System.out.println("Updated LinkedHashSet: " + linkedset);
	}

}
