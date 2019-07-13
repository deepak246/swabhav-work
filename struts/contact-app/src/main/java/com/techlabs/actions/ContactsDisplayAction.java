package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

public class ContactsDisplayAction extends ActionSupport{
	
	private ContactService cs;
	private List<Contact> contactsList;
	private int count;
	
	public int getCount() {
		return count;
	}

	public ContactsDisplayAction() {
		cs = ContactService.getInstance();
		contactsList = new ArrayList<Contact>();
	}
	
	public String execute() {
		contactsList = cs.getInstance().getContactsList();
		count = contactsList.size();
		return this.SUCCESS;
	}

	public List<Contact> getContactsList() {
		return contactsList;
	}
}
