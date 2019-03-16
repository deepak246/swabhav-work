package com.techlabs.dependency.case2;

public class A {
	IFooable obj;
	public A(IFooable obj) {
		this.obj = obj;
	}
	public void bar() {
		System.out.println("inside bar");
		obj.foo();
	}
}
