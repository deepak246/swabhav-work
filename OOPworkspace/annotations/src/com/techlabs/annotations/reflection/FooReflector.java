package com.techlabs.annotations.reflection;

import com.techlabs.annotations.Foo;
import com.techlabs.annotations.RequireModification;

import java.lang.reflect.*;
import java.lang.annotation.*;

public class FooReflector {

	public static void main(String[] args) {
		Class reflectClass = Foo.class;
		Class<RequireModification> ann = RequireModification.class;

		int count = 0;
		for (Method m : reflectClass.getMethods()) {
			if (m.isAnnotationPresent(ann)) {
				count++;
			}
		}
		System.out.println("Found " + count + " methods @RequireModification");
	}

}
