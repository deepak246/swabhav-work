package com.techlabs.account.test;

import com.techlabs.account.*;

public class TestAccount {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount(101,"Deepak",5000);
		//printDetails(sa);
		//sa.deposit(500);
		//printDetails(sa);
		//sa.withdraw(5000);
		//printDetails(sa);
		CurrentAccount ca = new CurrentAccount(202,"XYZ",20000);
		printDetails(ca);
		//ca.deposit(2000);
		//printDetails(ca);
		ca.withdraw(21000);
		printDetails(ca);
		//System.out.println(20-21);
	}
	
	public static void printDetails(Account acc) {
		System.out.println("AccountNo=" + acc.getAccno() + " Name=" + acc.getName() 
							+ " Balance=" + acc.getBalance());
	}

}
