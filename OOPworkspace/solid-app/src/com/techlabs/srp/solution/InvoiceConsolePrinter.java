package com.techlabs.srp.solution;

public class InvoiceConsolePrinter {
	
	public void print(Invoice invoice) {
		System.out.println("Id:"+invoice.getId()+" Name:"+invoice.getName()+
				" Total cost:"+invoice.calculateFinalCost());
	}
}
