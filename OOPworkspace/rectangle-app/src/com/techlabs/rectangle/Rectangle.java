package com.techlabs.rectangle;

public class Rectangle {
	private int width, height;

	public void setWidth(int width) {	
		this.width = checkDimension(width);
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int height) {		
		this.height = checkDimension(height);
	}
	public int getHeight() {
		return height;
	}
	private int checkDimension(int dimension) {
		if (dimension <= 0)
			dimension = 1;
		if (dimension > 100)
			dimension = 100;
		return dimension;
	}
	public int calculateArea() {
		return height * width;
	}
}
