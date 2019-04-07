package com.techlabs.srp.solution.test;

import com.techlabs.srp.solution.InvoiceConsolePrinter;
import com.techlabs.srp.solution.Invoice;

public class TestInvoice {

	public static void main(String[] args) {
		
		Invoice invoice = new Invoice(102, "abc", 100, 0.1);
		
		InvoiceConsolePrinter icp = new InvoiceConsolePrinter();
		icp.print(invoice);
	}

}
