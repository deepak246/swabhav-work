package com.techlabs.basic;

import java.util.*;

public class TestEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = 0;
		System.out.println("Enter the number for range");
		int limit = sc.nextInt();
		int arrayOfEven[] = checkEven(limit);
		int arrayOfOdd[] = checkOdd(limit);
		System.out.println("Even numbers till " + limit + " are:");
		for (int evens : arrayOfEven)
			System.out.print(evens + " ");
		System.out.println();
		System.out.println("Odd numbers till " + limit + " are:");
		for (int odds : arrayOfOdd)
			System.out.print(odds + " ");
	}

	public static int[] checkOdd(int limit) {
		int[] arrayOfOdd = new int[limit / 2];
		int index = 0;
		for (int num = 1; num <= limit; num += 2) {
			arrayOfOdd[index] = num;
			index++;
		}
		return arrayOfOdd;
	}

	public static int[] checkEven(int limit) {
		int[] arrayOfEven = new int[limit / 2 + 1];
		int index = 0;
		for (int num = 0; num <= limit; num += 2) {
			arrayOfEven[index] = num;
			index++;
		}
		return arrayOfEven;
	}

}
