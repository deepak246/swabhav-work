package com.techlabs.singletonpattern;

public class SingleObject {
	
	private static SingleObject instance = new SingleObject();
	private int count;
	
	private SingleObject() {
		count = 1;
	}
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		count++;
		System.out.println("Example of singleton design pattern " + count +" count");
	}
}
