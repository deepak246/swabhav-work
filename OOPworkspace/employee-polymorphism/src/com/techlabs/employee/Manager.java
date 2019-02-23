package com.techlabs.employee;
  
public class Manager extends Employee{
	private double hra = 0.5;
	private double da = 0.4;
	private double ta = 0.3;
	
	public Manager(String name, double basicSal, String date) {
		super(name, basicSal, date);
	}
	
	@Override
	public double calculateTotalSalary() {
		double updatedSal = basicSal + (basicSal * hra) + (basicSal * da) + (basicSal * ta);
		return updatedSal; 
	}
}
