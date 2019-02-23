package com.techlabs.employee;

public class Developer extends Employee{
	
	private double pa = 0.3;
	
	public Developer(String name, double basicSal, String date) {
		super(name, basicSal, date);
	}
	@Override
	public double calculateTotalSalary() {
		double updatedSal = (basicSal * pa) + basicSal;
		return updatedSal;
	}
}
