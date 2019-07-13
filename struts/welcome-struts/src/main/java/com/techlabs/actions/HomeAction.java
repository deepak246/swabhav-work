package com.techlabs.actions;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class HomeAction implements Action{
	private String message;
	
	public HomeAction(){
		System.out.println("Home Action Created");
	}

	@Override
	public String execute() throws Exception {
		System.out.println("Inside action execute");
		//this.message = ServletActionContext.getRequest().getParameter("message");
		return this.SUCCESS;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
