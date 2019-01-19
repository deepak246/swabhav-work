package com.techlabs.circle;

public class Circle {
	private float radius;
	private static final float PI = 3.14f;
	
	private ColorOptions bgColor;
	
	public ColorOptions getBgColor() {
		return bgColor;
	}

	public void setBgColor(ColorOptions bgColor) {
		this.bgColor = bgColor;
	}
	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {

		this.radius = checkDimension(radius);
	}

	private float checkDimension(float dimension) {
		if (dimension <= 0f)
			dimension = 0.1f;
		if (dimension > 0.9f)
			dimension = 0.9f;
		return dimension;
	}

	public float calculateArea() {
		return PI * radius * radius;
	}

}
