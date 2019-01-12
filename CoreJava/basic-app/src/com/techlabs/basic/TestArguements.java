package com.techlabs.basic;

public class TestArguements {

	public static void main(String[] names) {
		int n = names.length;
		if (n > 0) {
			for (String name : names) {
				System.out.println("Hello " + name);
			}
			System.out.println("Thank You");
		} else {
			System.out.println("Invalid Input! please input more characters");
		}
	}

}
