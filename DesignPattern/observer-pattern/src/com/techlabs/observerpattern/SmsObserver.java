package com.techlabs.observerpattern;

public class SmsObserver implements IBalanceChangeObserver{

	@Override
	public void balanceChanged(Account account) {
		System.out.println("Balance updated successfully (SMS notification)");
	}
	
}
