package com.techlabs.thirdparty;

public class Account {
	private double balance;
	private int accno;
	private String name;
	
	public Account( int accno, String name, double balance) {
		
		this.balance = balance;
		this.accno = accno;
		this.name = name;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	public void withdraw(double amount) {
		if((balance - amount)>1000) {
			balance = balance - amount;
		}
	}

	public double getBalance() {
		return balance;
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}
	
}
