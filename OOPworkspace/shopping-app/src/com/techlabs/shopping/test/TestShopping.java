package com.techlabs.shopping.test;

import java.io.IOException;
import java.util.Date;

import com.techlabs.shopping.Customer;
import com.techlabs.shopping.LineItem;
import com.techlabs.shopping.Order;
import com.techlabs.shopping.Product;
import com.techlabs.shopping.htmlfile.HtmlFileGenerator;

public class TestShopping {

	public static void main(String[] args) throws IOException {
		Product p1 = new Product(1, "book", 100, 10);
		Product p2 = new Product(2, "laptop", 10000, 10);
		Product p3 = new Product(1, "book", 100, 10);

		LineItem l1 = new LineItem(101, 10, p1);
		LineItem l2 = new LineItem(102, 10, p2);
		LineItem l3 = new LineItem(101, 10, p3);

		Order o1 = new Order(new Date());
		o1.addLineItem(l1);
		o1.addLineItem(l2);
		o1.addLineItem(l3);

		Customer c1 = new Customer("deepak", "andheri");
		c1.placeOrder(o1);

		System.out.println(c1);

		HtmlFileGenerator file = new HtmlFileGenerator();
		file.addToHtmlFile(c1);

	}

}
