package com.techlabs.dependency.case1;

public class A {
	private B b;
	public A(B b) {
		this.b = b;
	}
	public void bar() {
		System.out.println("inside bar");
		b.foo();
	}
}
