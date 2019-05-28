package com.techlabs.facadepattern.test;

import com.techlabs.facadepattern.ShapeMaker;

public class TestShapeMaker {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
