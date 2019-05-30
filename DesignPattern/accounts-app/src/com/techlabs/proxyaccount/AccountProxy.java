package com.techlabs.proxyaccount;

import java.time.LocalTime;

import com.techlabs.thirdparty.Account;

public class AccountProxy extends Account {

	private Account account;
	private LocalTime time = LocalTime.now(); 
	
	public AccountProxy(int accno, String name, double balance) {	
		super(accno,name,balance);
		account = new Account(accno,name,balance);
	}
	
	public Account getAccount() {
		return account;
	}

	public LocalTime getTime() {
		return time;
	}

	public void deposit(double amount) {
		super.deposit(amount);
		System.out.println("deposited: "+amount+" at time: "+time);
	}

	public void withdraw(double amount) {
		super.withdraw(amount);
		System.out.println("Withdrawn: "+amount+" at time: "+time);
	}
	
}
