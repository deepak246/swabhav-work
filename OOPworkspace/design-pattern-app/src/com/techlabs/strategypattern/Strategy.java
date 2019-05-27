package com.techlabs.strategypattern;

public class Strategy {
	private IOperable op;
	
	public Strategy(IOperable op) {
		this.op = op;
	}
	
	public int performOperation(int num1, int num2) {
		return op.doOperation(num1, num2);
	}

}
