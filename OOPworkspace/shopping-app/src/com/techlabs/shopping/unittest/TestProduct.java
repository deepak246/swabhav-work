package com.techlabs.shopping.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlabs.shopping.Product;

public class TestProduct {

	@Test
	public void checkProductIsGettingAddedUsingGetter() {
		Product product = new Product(20,"computer",100,5);
		int actualId = product.getProductId();
		int expectedId = 20;
		assertEquals(actualId, expectedId);
		
	}

}
