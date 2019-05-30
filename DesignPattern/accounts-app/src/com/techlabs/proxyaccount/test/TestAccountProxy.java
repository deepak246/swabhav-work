package com.techlabs.proxyaccount.test;

import com.techlabs.proxyaccount.AccountProxy;

public class TestAccountProxy {

	public static void main(String[] args) {
		AccountProxy acc = new AccountProxy(101,"abc",5000);
		acc.deposit(500);
		acc.withdraw(200);
		System.out.println(acc.getBalance());
	}

}
