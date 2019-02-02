package com.techlabs.account;

public class Account {
	private int accno;
	private String name;
	private double balance;
	private static int transactionCount=0;
	
	public Account(int accno,String name,double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public Account(int accno, String name) {
		this(accno,name,500);
	}
	public void deposit(int amount) {
		this.balance = this.balance + amount;
		transactionCount++;
	}
	public void withdraw(int amount) {
		double updatedBal = this.balance - amount;
		if(updatedBal>500) {
			this.balance = this.balance - amount;
		}
		transactionCount++;
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
	public static int getTransactionCount() {
		return transactionCount;
	}
}
