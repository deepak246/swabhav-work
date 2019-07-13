package com.techlabs.model;

import java.util.Date;

public class BankTransaction {

	private String name, type;
	private String date;
	private double amount;

	public BankTransaction(String name, String date, String type, double amount) {
		this.name = name;
		this.date = date;
		this.type = type;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
