package com.techlabs.inheritance.withconstructor.test;
import com.techlabs.inheritance.withconstructor.*;

public class TestInheritanceWithConstructor {

	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.getFoo());
		Child c2 = new Child();
		System.out.println(c2.getFoo());
		Child c3 = new Child(200);
		System.out.println(c3.getFoo());

	}

}
