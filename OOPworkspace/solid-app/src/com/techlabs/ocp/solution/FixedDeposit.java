package com.techlabs.ocp.solution;

import com.techlabs.ocp.violation.FestivalType;

public class FixedDeposit {
	private String accno, name;
	private double principal;
	private int years;
	private IFestivalRate festivalRate;
	
	public FixedDeposit(String accno, String name, double principal, int years,
			IFestivalRate festivalRate) {
		this.accno = accno;
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.festivalRate = festivalRate;
	}
	
	public double calculateSimpleInterest() {
		return principal * years * festivalRate.calculateRate();
	}
}
