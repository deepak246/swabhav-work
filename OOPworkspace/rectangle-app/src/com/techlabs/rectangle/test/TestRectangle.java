package com.techlabs.rectangle.test;

import com.techlabs.rectangle.*;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();

		r.setHeight(-10);
		r.setWidth(5);
		int area = r.calculateArea();
		System.out.println("Height="+r.getHeight()+" Width="+r.getWidth()+" Area="+area);
	}

}
