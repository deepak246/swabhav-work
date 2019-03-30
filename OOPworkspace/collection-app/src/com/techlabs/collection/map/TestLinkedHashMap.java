package com.techlabs.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		Map<LineItem, LineItem> map = new LinkedHashMap<LineItem, LineItem>();
		LineItem l1 = new LineItem(103, "book", 200, 5);
		LineItem l2 = new LineItem(103, "book", 100, 5);
				
		//Map<Student, Student> map = new LinkedHashMap();
		//Student l1 = new Student(101,10,"A","B");
		//Student l2 = new Student(101,10,"C","D");
		map.put(l1, l1);
		map.put(l1, l1);
		map.put(l2, l2);
		System.out.println(map.size());
	}

}
