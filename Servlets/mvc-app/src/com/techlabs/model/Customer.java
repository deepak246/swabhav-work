package com.techlabs.model;

import java.util.UUID;

public class Customer {
	private String firstname, lastname, dob;
	private double balance;
	private String id;
	private CardType card;
	
	public Customer(String firstname, String lastname, String dob,
			 double balance, CardType card) {
		System.out.println("customer created");
		this.id = UUID.randomUUID().toString();
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.balance = balance;
		this.card = card;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setCard(CardType card) {
		this.card = card;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getDob() {
		return dob;
	}

	public double getBalance() {
		return balance;
	}

	public String getId() {
		return id;
	}

	public CardType getCard() {
		return card;
	}
	
}
