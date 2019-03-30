package com.techlabs.lineitem.test;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class TestGenericItem {

	public static void main(String[] args) {
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(101,"book",2,500));
		cart.add(new LineItem(102,"pen",3,10));
		cart.add(new LineItem(103,"pencil",5,2));
		//cart.add("Shekhar");
		
		for(LineItem element : cart) {
			//LineItem item = (LineItem)element;
			System.out.println(element.calculateTotal());
		}
	}

}
