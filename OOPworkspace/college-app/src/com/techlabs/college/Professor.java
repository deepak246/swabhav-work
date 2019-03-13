package com.techlabs.college;

public class Professor extends Person implements SalariedEmployee{
	
	private double totalSal;
	private double da = 0.3;
	public Professor(int id, String address, String dob){
		super(id,address,dob);
	}

	@Override
	public double calculateSalary() {
		totalSal = BASICSAL + BASICSAL*da; 
		return totalSal;
	}
	
}
