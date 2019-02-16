package com.techlabs.account;

public class Account {
	private int accno;
	private String name;
	private double balance;
	private static int transactionCount=0;
	
	public Account(int accno,String name,double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	public Account(int accno, String name) {
		this(accno,name,500);
	}
	public void deposit(int amount) {
		this.balance = this.balance + amount;
		transactionCount++;
	}
	public void withdraw(int amount) {
		double updatedBal = this.balance - amount;
		if(updatedBal>500) {
			this.balance = this.balance - amount;
		}
		transactionCount++;
	}
	public int getAccno() {
		return accno;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public static int getTransactionCount() {
		return transactionCount;
	}
	@Override
	public String toString() {
		//return 1;
		//System.out.println(super.toString());
		return super.toString()+ "\n accno:" + accno + ", name:" + name 
				+ ", balance:" + balance;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
	          return true;
	     }
	     if (obj == null) { 
	         return false;
	     }
	     if (getClass() != obj.getClass()) {
	          return false;
	     }
	     Account other = (Account) obj;
	     return (this.accno == other.accno && this.name.equals(other.name)
	    		 && this.balance == other.balance);
	}
}
