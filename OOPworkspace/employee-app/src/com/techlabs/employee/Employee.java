package com.techlabs.employee;

public class Employee {
	private static int nextEmpno=100;
	private String firstname;
	private String lastname;
	private int empno;
	
	
	
	public Employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.nextEmpno++;
		this.empno = this.nextEmpno;
	}
	
	public int getEmpno() {
		return empno;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastName() {
		return lastname;
	}
}

