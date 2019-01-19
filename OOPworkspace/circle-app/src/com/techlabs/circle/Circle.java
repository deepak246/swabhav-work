package com.techlabs.circle;

public class Circle {
	private float radius;
	private static final float PI = 3.14f;
	private String bgColor;
	private static final String DEFAULT_BGCOLOR = "blue";

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = checkBgColor(bgColor);
	}

	private String checkBgColor(String bgColor) {
		if ((bgColor.equalsIgnoreCase("red")) || (bgColor.equalsIgnoreCase("blue"))
				|| (bgColor.equalsIgnoreCase("green"))) {
			return bgColor;
		}
		return DEFAULT_BGCOLOR;
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
