package com.techlabs.singletonwithenum.test;

import com.techlabs.singletonwithenum.SingletonEnum;

public class TestSingletonEnum {

	public static void main(String[] args) {
		SingletonEnum singleton = SingletonEnum.INSTANCE;
		
		System.out.println(singleton.getValue());
		singleton.setValue(2);
		System.out.println(singleton.getValue());
	}

}
