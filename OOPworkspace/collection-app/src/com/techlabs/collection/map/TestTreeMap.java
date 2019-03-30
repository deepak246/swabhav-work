package com.techlabs.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.techlabs.collection.set.Student;
import com.techlabs.lineitem.LineItem;

public class TestTreeMap {

	public static void main(String[] args) {
		Map<Student, Student> map = new TreeMap<Student, Student>();
		Student l1 = new Student(101,10,"A","B");
		Student l2 = new Student(101,10,"C","D");
		
		//Map<LineItem, LineItem> map = new TreeMap<LineItem, LineItem>();
		//LineItem l1 = new LineItem(103, "book", 200, 5);
		//LineItem l2 = new LineItem(103, "book", 100, 5);
		
		map.put(l1, l1);
		map.put(l1, l1);
		map.put(l2, l2);
		System.out.println(map.size());
	}

}
