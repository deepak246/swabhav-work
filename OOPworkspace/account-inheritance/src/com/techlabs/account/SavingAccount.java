package com.techlabs.account;

public class SavingAccount extends Account {
	public SavingAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}
	@Override
	public void withdraw(double amount) {
		//balance = getBalance();
		double updatedBal = balance - amount;
		if(updatedBal>500) {
			balance = balance - amount;
		}
	}
}
