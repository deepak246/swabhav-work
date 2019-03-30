package com.techlabs.collection.set;

import com.techlabs.collection.set.Student;

public class LineItem implements Comparable {


	private int id;
	private String name;
	private double cost;
	private int quantity;
	
	
	public LineItem(int id,String name,double cost,int quantity) {
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.quantity=quantity;
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
	public int getQuantity() {
		return quantity;
	}
	
	public double calculateTotal() {
		double price =quantity * cost;
		return price;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || this.getClass()!=obj.getClass())
			return false;
		LineItem lineItem=(LineItem) obj;
		return ((lineItem.id == this.id)&&(lineItem.name == this.name));
	}	
	
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public int compareTo(Object obj) {
		LineItem lineItem=(LineItem) obj;
		return this.id - lineItem.id;
	}
	@Override
	public String toString() {
		return "ID = "+this.id+", Name = "+this.name+", cost = "+this.cost+
				", quantity = "+this.quantity+";";
	}
	
}