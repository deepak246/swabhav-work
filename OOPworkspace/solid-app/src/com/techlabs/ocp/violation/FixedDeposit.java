package com.techlabs.ocp.violation;

public class FixedDeposit {
	private String accno, name;
	private double principal;
	private int years;
	private FestivalType festival;
	
	public FixedDeposit(String accno, String name, double principal, int years,
			FestivalType festival) {
		this.accno = accno;
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.festival = festival;
	}
	
	public double calculateSimpleInterest() {
		if(festival == FestivalType.HOLI) {
			return principal * years * 0.08;
		}
		if(festival == FestivalType.NEWYEAR) {
			return principal * years * 0.085;
		}
		return principal * years * 0.07;
	}
}
