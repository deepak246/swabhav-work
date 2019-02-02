package com.techlabs.account.test;

import com.techlabs.account.*;

public class TestAccount {

	public static void main(String[] args) {
		Account acc[] = new Account[3];
		acc[0] = new Account(101, "Deepak", 1000);
		acc[1] = new Account(103, "ABC", 5000);
		acc[2] = new Account(102, "xyz");
		printDetails(acc[0]);
		printDetails(acc[2]);		
		acc[0].withdraw(200);
		acc[2].deposit(2000);
		printDetails(acc[0]);
		printDetails(acc[2]);
		Account richestAccountHolder = checkRichest(acc);
		System.out.println("Richest Account holder details: ");
		printDetails(richestAccountHolder);
		System.out.println("Transaction count = "+Account.getTransactionCount());
	}

	public static void printDetails(Account acc) {
		System.out.println("AccountNo=" + acc.getAccno() + " Name=" + acc.getName() 
							+ " Balance=" + acc.getBalance());
	}

	public static Account checkRichest(Account acc[]) {
		double maxBal = acc[0].getBalance();
		int position=0;
		for (int index = 1; index < acc.length; index++) {
			position = findMax(acc,index,maxBal,position);
		}
		return acc[position];
	}
	public static int findMax(Account acc[],int index,double maxBal,int position) {
		if (maxBal < acc[index].getBalance()) {
			position = index;
		}
		return position;
	}
}
