package com.techlabs.foo;

import java.util.*;
import java.lang.reflect.*;

import java.io.*;

public class PropertyDemo {

	private static String filePath = "Data\\info.properties";

	public static void main(String[] args) throws Exception {
		
		FileReader reader=new FileReader(filePath);
		Properties p = new Properties();

		//p.setProperty("swabhav.className", "java.lang.String");

		//p.store(new FileWriter(filePath), null);
		
		p.load(reader);
		//System.out.println(p.getProperty("swabhav.className")); 
		
		String classInfo = p.getProperty("swabhav.className");
		//System.out.println(classInfo);
		
		Class reflectClass = Class.forName(classInfo);
		String classname = reflectClass.getName();
		
		System.out.println(classname);
		
		Constructor[] constructors = reflectClass.getConstructors();
		int constructorCount = constructors.length;
		Method[] methods = reflectClass.getMethods();
		int methodCount = methods.length;
		
		System.out.println("Constructor count = " + constructorCount);
		System.out.println("Methods count = " + methodCount);

	}

}
