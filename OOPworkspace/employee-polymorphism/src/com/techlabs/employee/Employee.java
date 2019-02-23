package com.techlabs.employee;

public abstract class Employee {
	private static int nextEmpId=100;
	private String name;
	private int empId;
	protected double basicSal;
	private String date;
	
	public Employee(String name, double basicSal, String date) {
		nextEmpId++;
		this.empId = nextEmpId;
		this.name = name;
		this.basicSal = basicSal;
		this.date = date;
	}
	public abstract double calculateTotalSalary() ;
	
	public int getEmpId() {
		return empId;
	}
	public String getname() {
		return name;
	}
	public double getbasicSal() {
		return basicSal;
	}
	public String getDate() {
		return date;
	}
}
