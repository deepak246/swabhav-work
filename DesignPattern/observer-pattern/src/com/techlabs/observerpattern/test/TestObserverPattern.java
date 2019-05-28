package com.techlabs.observerpattern.test;

import com.techlabs.observerpattern.Account;
import com.techlabs.observerpattern.EmailObserver;
import com.techlabs.observerpattern.SmsObserver;

public class TestObserverPattern {
	public static void main(String args[]) {
		Account acc1 = new Account(101,"ABC","abc@gmail.com",5000);
		acc1.addObserver(new EmailObserver());
		acc1.addObserver(new SmsObserver());
		acc1.withdraw(1000);
	}
	
}
