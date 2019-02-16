package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestToString {

	public static void main(String[] args) {
		Account acc1 = new Account(101, "Deepak", 1000);
		System.out.println(acc1.toString());
		System.out.println(acc1);
		//Object x;
	}
}
