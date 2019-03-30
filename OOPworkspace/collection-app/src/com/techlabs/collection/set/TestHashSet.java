package com.techlabs.collection.set;

import java.util.HashSet;
import java.util.Set;

import com.techlabs.lineitem.LineItem;

public class TestHashSet {

	public static void main(String[] args) {
		Set<Student> set = new HashSet();
		Student s1 = new Student(101,10,"A","B");
		Student s2 = new Student(101,10,"C","D");
		
		//Set<LineItem> set = new HashSet();
		//LineItem l1 = new LineItem(103, "book", 200, 5);
		//LineItem l2 = new LineItem(103, "book", 200, 5);
		
		set.add(s1);
		set.add(s1);
		set.add(s2);
		System.out.println(set.size());
		System.out.println(set);
	}

}
