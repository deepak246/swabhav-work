package com.techlabs.hashset;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Ravi");
		hs1.add("Vijay");
		hs1.add("Arun");
		hs1.add("Sumit");
		System.out.println("An initial list of elements: " + hs1);
		// Removing specific element from HashSet
		hs1.remove("Ravi");
		System.out.println("After invoking remove() method: " + hs1);
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("Ajay");
		hs2.add("Gaurav");
		hs1.addAll(hs2);
		System.out.println("Updated List: " + hs1);
		// Removing all the new elements from HashSet
		hs1.removeAll(hs2);
		System.out.println("After invoking removeAll() method: " + hs1);
		// Removing elements on the basis of specified condition
		hs1.removeIf(str -> str.contains("Vijay"));
		System.out.println("After invoking removeIf() method: " + hs1);
		// Removing all the elements available in the set
		hs1.clear();
		System.out.println("After invoking clear() method: " + hs1);
	}

}
