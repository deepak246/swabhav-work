package com.techlabs.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectionSort {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("ajay");
		list.add("vijay");
		list.add("shyam");
		list.add("ram");
		
		System.out.println("LIST = "+list);
		Collections.sort(list);
		System.out.println("Sorted LIST = "+list);
	}

}
