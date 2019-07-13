package com.techlabs.actions;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.BankTransaction;
import com.techlabs.service.BankService;

public class TransactionAction extends ActionSupport implements SessionAware {
	
	@Autowired
	private BankService bankSvc;
	private double amount;
	private String type, date, name;

	String pattern = "yyyy-MM-dd";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	private BankTransaction bTransaction; 
	
	private SessionMap<String,Object> sessionMap;

	public TransactionAction() {

	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setDate(String date) {
		this.date = date;
	}

	public String execute() {
		if (sessionMap.get("username") != null) {
			return this.SUCCESS;
		}
		return this.LOGIN;
	}
	
	public void validate() {
		System.out.println("tansaction validate");
		if(this.type!=null) {
			System.out.println("1st if called");
			if(!this.type.equals("") && this.amount > 0.0) {
				System.out.println("2nd if called");
				this.name = (String) sessionMap.get("username");
				this.date = simpleDateFormat.format(new Date());
				bTransaction = new BankTransaction(this.name, this.date, this.type, this.amount);
				try {
					bankSvc.addTransaction(bTransaction);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return;
			}
			addActionError("Please fill all fields");
		}
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap=(SessionMap)session;
	}

}
