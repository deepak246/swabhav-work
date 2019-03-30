package com.techlabs.account.exception;

public class InsufficientFundsException extends RuntimeException {
	public InsufficientFundsException(Account account) {
		super("cannot withdraw from account "+ account.getAccno() +
				" due to insufficient balance as per bank guidelines");
	}
}
