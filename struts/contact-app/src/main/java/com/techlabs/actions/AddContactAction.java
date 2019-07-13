package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

public class AddContactAction extends ActionSupport {

	private String name, email, contactNo;

	public String execute() {
		return this.SUCCESS;
	}

	public void validate() {
		if (this.name != null && this.email != null && this.contactNo != null) {
			if (!this.name.equals("") && !this.email.equals("") && !this.contactNo.equals("")) {
				ContactService.getInstance().addContact(new Contact(this.name, this.email, this.contactNo));
				return;
			}
			addActionError("Please fill all fields");
		}
		
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
}
