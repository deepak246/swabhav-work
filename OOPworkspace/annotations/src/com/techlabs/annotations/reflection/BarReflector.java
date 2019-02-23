package com.techlabs.annotations.reflection;

import com.techlabs.annotations.Bar;
import com.techlabs.annotations.Foo;
import com.techlabs.annotations.ProUnitTest;
import com.techlabs.annotations.RequireModification;

import java.lang.reflect.*;
import java.lang.annotation.*;

public class BarReflector {
	
	public static int passed = 0, failed = 0;

	public static void main(String[] args) throws Exception {
		Class obj = Bar.class;
		
		for (Method m : obj.getMethods()) {
			if (m.isAnnotationPresent(ProUnitTest.class)) {				
				boolean result = (boolean) m.invoke(obj.newInstance());
				checkIfPassed(result);
				checkIfFailed(result);
			}
		}
		int total = passed + failed;
		System.out.println("Found " + total + " methods @ProUnitTest");	
		System.out.println("Test cases passed = "+passed);
		System.out.println("Test cases failed = "+failed);
	}
	
	private static void checkIfPassed(boolean result) {
		if(result == true) {
			passed++;
		}
	}
	
	private static void checkIfFailed(boolean result) {
		if(result == false) {
			failed++;
		}
	}
}
