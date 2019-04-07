package com.techlabs.shopping;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Order {
	private int orderId;
	private Date date;
	private static int nextOrderId = 1;
	private List<LineItem> items;

	public Order(Date date) {
		this.date = date;
		orderId = nextOrderId++;
		items = new ArrayList<LineItem>();
	}

	public int getOrderId() {
		return orderId;
	}

	public Date getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void addLineItem(LineItem lineItem) {
		for (Iterator<LineItem> i = items.iterator(); i.hasNext();) {
			LineItem item = (LineItem) i.next();
			if (item.getProduct().equals(lineItem.getProduct())) {
				int quantity = lineItem.getQuantity() + item.getQuantity();
				item.setQuantity(quantity);
				return;
			}
		}
		items.add(lineItem);
	}

	public double checkoutPrice() {
		double orderCost = 0;
		for (Iterator<LineItem> item = items.iterator(); item.hasNext();) {
			LineItem lineItem = (LineItem) item.next();
			orderCost = orderCost + lineItem.getLineItemCost();
		}
		return orderCost;
	}

	@Override
	public String toString() {
		return "OrderId:" + orderId + " Date:" + date + "\nLine Items:-\n" 
				+ getItems() + "\nOrder total cost:" + checkoutPrice();
	}

}
