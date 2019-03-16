package com.techlabs.exceptiontest;

public class RuntimeExceptionStackTest {

	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end of main");
	}

	public static void m1() {
		System.out.println("inside m1");
		m2();
	}

	public static void m2() {
		System.out.println("inside m2");
		m3();
	}

	public static void m3() {
		System.out.println("inside m3");
		throw new RuntimeException("error in m3");
	}

}
