package com.techlabs.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private IBalanceChangeObserver observer;
	private int accno;
	private String name, email;
	private double balance;
	private List<IBalanceChangeObserver> observers;
	
	public Account(int accno, String name, String email, double balance) {
		this.accno = accno;
		this.name = name;
		this.email = email;
		this.balance = balance;
		observers = new ArrayList<IBalanceChangeObserver>();
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public double getBalance() {
		return balance;
	}

	public List<IBalanceChangeObserver> getObservers() {
		return observers;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		notifyObservers();
	}
	
	public void withdraw(double amount) {
		if((balance - amount)>1000) {
			balance = balance - amount;
		}
		notifyObservers();
	}
	
	public void addObserver(IBalanceChangeObserver observer) {
		observers.add(observer);
	}
	
	private void notifyObservers() {
		for(IBalanceChangeObserver ibo : observers) {
			ibo.balanceChanged(this);
		}
	}
}
