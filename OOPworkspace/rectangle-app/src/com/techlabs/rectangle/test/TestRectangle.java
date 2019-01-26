package com.techlabs.rectangle.test;

import com.techlabs.rectangle.*;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();

		r1.setHeight(20);
		r1.setWidth(100);

		Rectangle r2 = new Rectangle();
		r2.setHeight(50);
		r2.setWidth(70);

		printDetails(r1);
		printDetails(r2);

		Rectangle r3 = r1;
		System.out.println(r3.getHeight());
		System.out.println(r1.getHeight());
		r3.setHeight(2);
		System.out.println(r3.getHeight());
		System.out.println(r1.getHeight());
		r3 = null;
		System.out.println(r1.getHeight());
		//System.out.println(r3.getHeight());
		System.out.println(new Rectangle().calculateArea());
		printDetails(new Rectangle());

	}

	public static void printDetails(Rectangle r) {
		int area = r.calculateArea();
		System.out.println("Height=" + r.getHeight() + " Width=" + r.getWidth() + " Area=" + area);
	}

}
