package com.techlabs.observerpattern;

public class EmailObserver implements IBalanceChangeObserver{

	@Override
	public void balanceChanged(Account account) {
		System.out.println("Balance Updated Successfully (Email notification)");
	}
	
}
