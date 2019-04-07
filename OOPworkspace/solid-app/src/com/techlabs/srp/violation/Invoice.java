package com.techlabs.srp.violation;

public class Invoice {
	private int id;
	private String name;
	private double cost, discount; 
	private final double GST = 0.12;
	
	public Invoice(int id, String name, double cost, double discount) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public double getDiscount() {
		return discount;
	}
	
	public double calculateTax() {
		return (cost * GST);
	}
	
	public double calculateDiscount() {
		return (cost * discount); 
	}
	
	public double calculateFinalCost() {
		return (cost - calculateDiscount() + calculateTax());
	}
	
	public void print() {
		System.out.println("Id:"+id+" Name:"+name+" cost:"+calculateFinalCost());
	}
}
