package com.techlabs.shopping.unittest;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.techlabs.shopping.LineItem;
import com.techlabs.shopping.Order;
import com.techlabs.shopping.Product;

public class TestOrder {
	@Test
	public void checkOrderIsPlacedUsingGetter() {
		Product product = new Product(20,"computer",100,5);
		LineItem item = new LineItem(2,10,product);
		Date date = new Date();
		Order order = new Order(date);
		Date actualDate = order.getDate();
		Date expectedDate = date;
		assertEquals(actualDate, expectedDate);
		
	}
}
