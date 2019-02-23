package com.techlabs.account;

public class CurrentAccount extends Account{
	public CurrentAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}
	@Override
	public void withdraw(double amount) {
		double updatedBal = balance - amount;
		
		if(updatedBal >= -2000) {
			
			balance = balance - amount;
		}
	}
}
