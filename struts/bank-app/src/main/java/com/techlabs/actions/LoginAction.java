package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.BankMaster;
import com.techlabs.service.BankService;
import com.techlabs.viewmodel.RegistrationVM;

public class LoginAction extends ActionSupport implements SessionAware, ModelDriven<RegistrationVM>{
	
	private RegistrationVM vm;
	private String message;
	
	@Autowired
	private BankService bankSvc;
	private BankMaster bm;
	private SessionMap<String,Object> sessionMap;  
	
	public LoginAction() {
		vm = new RegistrationVM();
	}
	
	public String execute() {
		return this.SUCCESS;
	}
	
	public void validate() {
		System.out.println("validate");
		System.out.println("user "+vm.getUsername()+" "+vm.getPassword());
		if (vm.getUsername() != null && vm.getPassword() != null) {
			System.out.println("user "+vm.getUsername()+" "+vm.getPassword());
			if (!vm.getUsername().equals("") && !vm.getPassword().equals("")) {
				try {
					System.out.println("user "+vm.getUsername()+" "+vm.getPassword());
					bm = bankSvc.loginValidate(vm.getUsername());
					if(bm.getPassword().equals(vm.getPassword())) {
						System.out.println("login success");
						sessionMap.put("username",bm.getName()); 
						sessionMap.put("balance", bm.getBalance());
						return;
					}
					addActionError("Invalid username or password");
					return;
				}
				catch(Exception e) {
					e.printStackTrace();
				}				
			}			
			addActionError("Please fill all the fields");
		}
	}
	
	public void setSession(Map<String, Object> session) {
		sessionMap=(SessionMap)session;  
	}

	@Override
	public RegistrationVM getModel() {
		// TODO Auto-generated method stub
		return vm;
	}

}
