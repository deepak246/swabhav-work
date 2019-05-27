package com.techlabs.strategypattern;

public class OperationAdd implements IOperable {
	

	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}
