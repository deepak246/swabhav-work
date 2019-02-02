package com.techlabs.business;

public class Contact {
	private String name;
	private String no;
	private String email;
	
	public Contact(String name, String no, String email) {
		this.name = name;
		this.no = no;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public String getEmail() {
		return email;
	}
	
}
