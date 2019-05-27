package com.techlabs.dip.solution;

public class FileLog implements ILogger{

	@Override
	public void log(String error) {
		System.out.println(error);
		System.out.println("Error logged in file successfully");		
	}

}
