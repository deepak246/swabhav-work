package com.techlabs.actions;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.BankService;

public class HomeAction extends ActionSupport implements SessionAware, ModelDriven<BankService>{

	private String message;
	private SessionMap<String,Object> sessionMap;
	private double balance;
	
	@Autowired
	private BankService bankSvc;
	
	public HomeAction() {
		
	}
	
	public String execute() {
		if(sessionMap.get("username")!=null) {
			return this.SUCCESS;
		}
		return this.LOGIN;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public double getBalance() {
		return balance;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap=(SessionMap)session;
		String username = (String)sessionMap.get("username");
		this.balance = bankSvc.getClientBalance(username);
	}

	@Override
	public BankService getModel() {
		return bankSvc;
	}
	
}
