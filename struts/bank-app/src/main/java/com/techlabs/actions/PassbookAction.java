package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.BankMaster;
import com.techlabs.model.BankTransaction;
import com.techlabs.service.BankService;

public class PassbookAction implements Action, SessionAware {

	@Autowired
	private BankService bankSvc;
	private List<BankTransaction> passbook;
	private SessionMap<String, Object> sessionMap;

	public PassbookAction() {
		passbook = new ArrayList<BankTransaction>();
	}

	@Override
	public String execute() throws Exception {
		if (sessionMap.get("username") != null) {
			String name = (String) sessionMap.get("username");
			passbook = bankSvc.getPassbookDetails(name);
			return this.SUCCESS;
		}
		return this.LOGIN;
	}

	public List<BankTransaction> getPassbook() {
		return passbook;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap) session;
	}

}
