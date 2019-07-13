package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

public class EditContactAction extends ActionSupport {
	
	private String id;
	private String name, email, contactNo;
	private Contact c;
	private static String contactId;
	
	public EditContactAction() {
		
	}

	public String execute() {
		System.out.println("execute called");	
		if(id!=null) {
			c = ContactService.getInstance().getContactById(id);
			contactId = id;
		}
		if(c!=null) {
			this.name = c.getName();
			this.email = c.getEmail();
			this.contactNo = c.getContactNo();
		}
		return this.SUCCESS;
	}
	
	public void validate() {
		System.out.println("validate called");
		if (this.name != null && this.email != null && this.contactNo != null) {
			if (!this.name.equals("") && !this.email.equals("") && !this.contactNo.equals("")) {
				//ContactService.getInstance().addContact(new Contact(this.name, this.email, this.contactNo));
				c = ContactService.getInstance().getContactById(contactId);
				System.out.println("name = "+this.name);
				System.out.println("contact = "+contactId);
				c.setName(this.name);
				c.setEmail(this.email);
				c.setContactNo(this.contactNo);
				return;
			}
			addActionError("Please fill all fields");
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
