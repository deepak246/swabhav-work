package com.techlabs.interfacecrud;

public class InvoiceDB implements ICrudable{
	public void create() {
		System.out.println("creating invoice DB");
	}
	public void read() {
		System.out.println("reading invoice DB");
	}
	public void update() {
		System.out.println("updating to invoice DB");
	}
	public void delete() {
		System.out.println("deleting from invoice DB");
	}
}
