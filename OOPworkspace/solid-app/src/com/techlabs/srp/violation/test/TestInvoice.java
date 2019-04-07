package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.Invoice;

public class TestInvoice {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(102, "abc", 100, 0.1);
		invoice.print();
	}

}
