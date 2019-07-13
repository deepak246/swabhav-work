package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.ContactService;

public class DeleteContactAction extends ActionSupport{
	
	private String id;
	
	public DeleteContactAction() {
		
	}
	
	public String execute() {
		ContactService.getInstance().deleteContact(id);
		return this.SUCCESS;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
