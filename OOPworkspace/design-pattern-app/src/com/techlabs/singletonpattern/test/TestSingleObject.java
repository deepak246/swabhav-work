package com.techlabs.singletonpattern.test;

import com.techlabs.singletonpattern.SingleObject;

public class TestSingleObject {

	public static void main(String[] args) {
		
		//SingleObject object = new SingleObject();
	
		SingleObject object = SingleObject.getInstance();
		
		SingleObject object1 = SingleObject.getInstance();
		
		object.showMessage();
		object.showMessage();
	
		object1.showMessage();
		object1.showMessage();
	}

}
