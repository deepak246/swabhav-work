package com.techlabs.calculator;

public class Calculator {
	public long cubeEvenNo(int no) {
		if(no % 2 == 0)
			return no*no*no;
		return -1;
	}
}
