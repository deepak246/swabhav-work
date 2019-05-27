package com.techlabs.dip.violation;

public class DatabaseLog {
	public void log(String error) {
		System.out.println(error);
		System.out.println("Error logged in DB successfully");
	}
}
