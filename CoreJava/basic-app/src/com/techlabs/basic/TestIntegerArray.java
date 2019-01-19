package com.techlabs.basic;

public class TestIntegerArray {

	public static void main(String[] args) {
		int no = 10;
		changeNumberToZero(no);
		System.out.println(no);
		int[] nos = { 10, 20, 30 };
		changeAllNumbersToZero(nos);
		for (int i : nos)
			System.out.println(i);
	}

	public static void changeNumberToZero(int n) {
		n = 0;
	}

	public static void changeAllNumbersToZero(int[] ns) {
		for (int i = 0; i < ns.length; i++)
			ns[i] = 0;
	}
}
