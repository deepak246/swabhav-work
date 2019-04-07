package com.techlabs.shopping;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int customerId;
	private String customerName, address;
	private static int nextCustomerId = 1;
	private List<Order> orders;
	
	public Customer(String customerName, String address) {
		this.customerName = customerName;
		this.address = address;
		customerId = nextCustomerId++;
		orders = new ArrayList<Order>();
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAddress() {
		return address;
	}

	public List<Order> getOrders() {
		return orders;
	}
	
	public void placeOrder(Order order) {
		orders.add(order);
	}
	
	@Override
	public String toString() {
		return "customer Id:"+ customerId +" Name:" + customerName + " Address: "
				+ address + "\nOrder details:\n" +getOrders()+"\n";
	}
}
