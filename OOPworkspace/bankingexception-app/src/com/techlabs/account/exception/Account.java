package com.techlabs.account.exception;

import com.techlabs.account.exception.test.TestAccount;

public class Account {
	//private Account account;	
	private int accno;
	private String name;
	private double balance;
	
	public Account(int accno,String name,double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	public void withdraw(double amount) {
		double updatedBal = this.balance - amount;
		if(updatedBal>500) {
			this.balance = this.balance - amount;
		}
		else {
			throw new InsufficientFundsException(this);
		}
	}
	public int getAccno() {
		return accno;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	
}
