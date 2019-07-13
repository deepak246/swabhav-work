package com.techlabs.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String username, password, message;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}

	public String doLogin() {
		if (this.username != null && this.password != null) {
			if (this.username.equals("admin") && this.password.equals("admin")) {
				this.message = "Login Successful. Welcome "+username;
				System.out.println("login successful");
				return "true";
			}
		}
		this.message = "Login Failed. Invalid username or password.";
		System.out.println("login failed");
		return "false";
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void validate() {
		if (this.username != null && this.password != null) {
			if (!this.username.equals("admin") && !this.password.equals("admin")) {
				this.message = "Login Failed. Invalid username or password.";
				addActionError("Invalid username or password");
				return;
			}
			this.message = "Login Successful. Welcome "+username;
		}
	}

}
