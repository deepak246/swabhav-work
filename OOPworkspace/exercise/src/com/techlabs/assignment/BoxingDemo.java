package com.techlabs.assignment;

public class BoxingDemo {

	public static void main(String[] args) {
		// creating an Integer Object
		// boxing with value 10.
		Integer numObject = new Integer(10);

		// unboxing the Object
		int number = numObject;

		System.out.println("Value of number object: " + numObject);
		System.out.println("Value of number: " + number);

		// Autoboxing of char
		Character alphabetWrapper = 'a';

		// Auto-unboxing of Character
		char alphabetPrimitive = alphabetWrapper;
		System.out.println("Value of alphabet(primitive): " + alphabetPrimitive);
		System.out.println("Value of alphabet(wrapper): " + alphabetWrapper);

	}

}
