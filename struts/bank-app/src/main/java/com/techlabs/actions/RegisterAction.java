package com.techlabs.actions;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.BankMaster;
import com.techlabs.model.BankTransaction;
import com.techlabs.service.BankService;
import com.techlabs.viewmodel.RegistrationVM;

public class RegisterAction extends ActionSupport implements ModelDriven<RegistrationVM>{

	@Autowired
	private BankService bankSvc;
	private RegistrationVM vm;
	private String name, password, type, cpassword;
	private double amount;
	private String date;
	private BankMaster bMaster;
	private BankTransaction bTransaction;
	String pattern = "yyyy-MM-dd";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

	public RegisterAction() {
		System.out.println("constructor called");
		vm = new RegistrationVM();
	}

	public String execute() {
		return this.SUCCESS;
	}

	public void validate() {
		System.out.println("validate called = "+vm.getUsername());
		
		if (vm.getUsername() != null && vm.getPassword() != null && vm.getCpassword() != null) {
			if (!vm.getUsername().equals("") && !vm.getPassword().equals("") && !vm.getCpassword().equals("")
					&& vm.getAmount() != 0.0) {
				if (!vm.getPassword().equals(vm.getCpassword())) {
					addActionError("Password & Confirm password did not match");
					return;
				}
				bMaster = new BankMaster(vm.getUsername(), vm.getPassword(), vm.getAmount());
				this.type = "D";
				this.date = simpleDateFormat.format(new Date());
				bTransaction = new BankTransaction(this.name, this.date, this.type, this.amount);
				try {
					bankSvc.registerClient(bMaster, bTransaction);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return;
			}
			addActionError("Please fill all fields");
		}

	}
	
	@Override
	public RegistrationVM getModel() {
		// TODO Auto-generated method stub
		return vm;
	}
}
