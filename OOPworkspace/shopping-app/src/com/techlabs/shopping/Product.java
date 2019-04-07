package com.techlabs.shopping;

public class Product {
	private int productId;
	private String productName;
	private double cost, discount;

	public Product(int productId, String productName, double cost, double discount) {
		this.productName = productName;
		this.cost = cost;
		this.discount = discount;
		this.productId = productId;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getCost() {
		return cost;
	}

	public double getDiscount() {
		return discount;
	}

	public double calcTotalCost() {
		discount = discount / 100;
		double totalCost = cost - (cost * discount);
		return totalCost;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Product prod = (Product) obj;

		return ((prod.productName.equalsIgnoreCase(this.productName)) 
				&& (prod.productId == this.productId));
	}

	@Override
	public int hashCode() {
		return this.productId;
	}

	@Override
	public String toString() {
		return "Id:" + productId + " Name:" + productName + " Cost:" + cost + 
				" Discount:" + discount + "%";
	}

}
