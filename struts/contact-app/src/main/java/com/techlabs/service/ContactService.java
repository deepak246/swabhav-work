package com.techlabs.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlabs.model.Contact;

public class ContactService {
	
	private static ContactService instance;
	private List<Contact> contactsList;
	Contact c1,c2;
	
	private ContactService() {
		contactsList = new ArrayList<Contact>();
		c1 = new Contact("deepak","dg@gmail.com","9876");
		c2 = new Contact("abhi","ab@yahoo.com","1234");
		addContact(c1);
		addContact(c2);
	}
	
	public static ContactService getInstance() {
		if(instance==null) {
			instance = new ContactService();
		}
		return instance;
	}
	
	public void addContact(Contact c) {
		contactsList.add(c);
	}

	public List<Contact> getContactsList() {
		return contactsList;
	}
	
	public void deleteContact(String id) {
		
		for (Iterator<Contact> iterator = contactsList.iterator(); iterator.hasNext(); ) {
		    Contact c = iterator.next();
		    if(c.getId().equals(id)) {
		        iterator.remove();
		    }
		}
	}
	
	public Contact getContactById(String id) {
		for(Contact c : contactsList) {
			if(c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}
	
	
}
