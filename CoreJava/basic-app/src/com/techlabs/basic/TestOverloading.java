package com.techlabs.basic;

public class TestOverloading {
	public static void main(String args[]) {
		System.out.print(false);
		System.out.print(10);
		System.out.print(10.5f);
		System.out.print("hello");
		System.out.print(14.5);
		
		printThis(10);
		printThis(10.5);
		printThis(10.5f);
		printThis("Hello");
		printThis(true);
	}
	public static void printThis(int i) {
		System.out.print(i);
	}
	public static void printThis(double d) {
		System.out.print(d);
	}
	public static void printThis(float a) {
		System.out.print(a);
	}
	public static void printThis(String c) {
		System.out.print(c);
	}
	public static void printThis(boolean b) {
		System.out.print(b);
	}
}
