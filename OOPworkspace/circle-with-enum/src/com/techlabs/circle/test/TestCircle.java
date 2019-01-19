package com.techlabs.circle.test;
import com.techlabs.circle.*;
public class TestCircle {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setBgColor(ColorOptions.BLUE);
		System.out.println("Color="+c.getBgColor());
		c.setRadius(0.5f);
		System.out.println("Radius="+c.getRadius()+" Area="+c.calculateArea());
	}

}
