package com.techlabs.employee;

public class Analyst extends Employee{
	
	private double perks = 0.2;
	
	public Analyst(String name, double basicSal, String date) {
		super(name,basicSal, date);
	}
	@Override
	public double calculateTotalSalary() {
		double updatedSal = (basicSal * perks) + basicSal;
		return updatedSal;
	}
}
