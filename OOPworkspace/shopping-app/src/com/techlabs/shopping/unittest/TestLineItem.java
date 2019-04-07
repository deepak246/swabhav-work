package com.techlabs.shopping.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.shopping.LineItem;
import com.techlabs.shopping.Product;

public class TestLineItem {
	
	@Test
	public void checkLineItemIsGettingAddedUsingGetter() {
		Product product = new Product(20,"computer",100,5);
		LineItem item = new LineItem(2,10,product);
		int actualQuantity = item.getQuantity();
		int expectedQuantity = 10;
		assertEquals(actualQuantity, expectedQuantity);
		
	}
}
