package com.techlabs.dip.solution;

public class DBLog implements ILogger{

	@Override
	public void log(String error) {
		System.out.println(error);
		System.out.println("Error logged in DB successfully");				
	}

}
