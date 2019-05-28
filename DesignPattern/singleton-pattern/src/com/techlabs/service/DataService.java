package com.techlabs.service;

public class DataService {
	
	private static DataService instance = new DataService();
	
	private DataService() {
		System.out.println("service created");
	}
	
	public void doSomething() {
		System.out.println("doing something");
	}
	
	public static DataService getInstance() {
		//return new DataService();
		return instance;
	}
	
	
}
