package com.techlabs.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.BankMaster;
import com.techlabs.model.BankTransaction;
import com.techlabs.repository.BankRepository;

@Service("bankService")
public class BankService {

	@Autowired
	private BankRepository br;
	
	public BankService() {
		System.out.println("bank service created");
		//br = new BankRepository();
	}
	
	public void registerClient(BankMaster bMaster, BankTransaction bTransaction) throws SQLException {
		System.out.println("Bank Service called");
		br.registerClient(bMaster, bTransaction);
	}
	
	public BankMaster loginValidate(String username) throws Exception{
		System.out.println("service called");
		return br.getClientDetails(username);
	}
	
	public List<BankTransaction> getPassbookDetails(String username){
		return br.getpassbook(username);
	}

	public void addTransaction(BankTransaction bTransaction) throws SQLException {
		br.addTransaction(bTransaction);
	}
	
	public double getClientBalance(String username) {
		return br.getClientBalance(username);
	}
}
