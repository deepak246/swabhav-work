package com.techlabs.person.reflection;

import java.lang.reflect.*;
import com.techlabs.person.*;

public class PersonReflection {

	public static int getterCount = 0, setterCount = 0;
	public static int methodCount = 0, constructorCount = 0;

	public static void main(String[] args) {

		Class reflectClass = Person.class;
		String classname = reflectClass.getName();

		Constructor[] constructors = reflectClass.getConstructors();
		constructorCount = constructors.length;
		Method[] methods = reflectClass.getMethods();
		methodCount = methods.length;

		// for (Method method : methods) { System.out.println(method.getName()); }
		
		countGetters(methods);
		countSetters(methods);

		System.out.println("Constructor count = " + constructorCount);
		System.out.println("Methods count = " + methodCount);
		System.out.println("Getter methods count = " + getterCount);
		System.out.println("Setter methods count = " + setterCount);
	}

	public static void countGetters(Method[] methods) {

		for (Method method : methods) {
			if (isGetter(method))
				getterCount++;
		}
	}

	public static void countSetters(Method[] methods) {

		for (Method method : methods) {
			if (isSetter(method))
				setterCount++;
		}
	}

	public static boolean isGetter(Method method) {
		if (!method.getName().startsWith("get"))
			return false;
		if (method.getParameterTypes().length != 0)
			return false;
		return true;
	}

	public static boolean isSetter(Method method) {
		if (!method.getName().startsWith("set"))
			return false;
		if (method.getParameterTypes().length != 1)
			return false;
		return true;
	}

}
