package com.techlabs.account.exception.test;

import com.techlabs.account.exception.Account;
import com.techlabs.account.exception.InsufficientFundsException;

public class TestAccount {

	public static void main(String[] args) {
		Account acc1 = new Account(101,"deepak",5000);
		Account acc2 = new Account(102,"abc",1000);
		try {
			acc2.withdraw(1000);
		}catch(InsufficientFundsException ex) {
			System.out.println(ex.getMessage());
		}
		//System.out.println("acc1 bal = "+acc1.getBalance());
	}

}
