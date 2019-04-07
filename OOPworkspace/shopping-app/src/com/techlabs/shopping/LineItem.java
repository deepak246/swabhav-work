package com.techlabs.shopping;

public class LineItem {
	private int lineItemId, quantity;
	private Product product;
	private double lineItemCost;

	public LineItem(int lineItemId, int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
		this.lineItemId = lineItemId;
	}

	public int getLineItemId() {
		return lineItemId;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public double calcLineItemCost() {
		lineItemCost = product.calcTotalCost() * quantity;
		return lineItemCost;
	}

	public double getLineItemCost() {
		return lineItemCost;
	}

	@Override
	public String toString() {
		return "LineItem Id=> " + lineItemId + "\nProduct Info=> " + product + "\nQuantity=> " 
				+ quantity + "\nLineItem cost:" + calcLineItemCost() + "\n";
	}

}
