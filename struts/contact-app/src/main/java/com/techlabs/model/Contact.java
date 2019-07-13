package com.techlabs.model;

import java.util.UUID;

public class Contact {
	private String name, email, contactNo, id;

	public Contact(String name, String email, String contactNo) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getContactNo() {
		return contactNo;
	}
	
	
}
