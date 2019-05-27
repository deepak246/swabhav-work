package com.techlabs.strategypattern.test;

import com.techlabs.strategypattern.OperationAdd;
import com.techlabs.strategypattern.OperationMultiply;
import com.techlabs.strategypattern.OperationSubtract;
import com.techlabs.strategypattern.Strategy;

public class TestStrategy {

	public static void main(String[] args) {
		Strategy strategy = new Strategy(new OperationAdd());
		System.out.println("10 + 5 = "+strategy.performOperation(10, 5));
		
		strategy = new Strategy(new OperationSubtract());
		System.out.println("10 - 5 = "+strategy.performOperation(10, 5));
		
		strategy = new Strategy(new OperationMultiply());
		System.out.println("10 * 5 = "+strategy.performOperation(10, 5));
		
	}

}
