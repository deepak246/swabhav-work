package com.techlabs.circle.test;

import com.techlabs.circle.*;

public class TestCircle {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(5.5f);
		System.out.println("Radius=" + c.getRadius() + " Area=" + c.calculateArea());
		c.setBgColor("black");
		System.out.println("color=" + c.getBgColor());
	}

}
