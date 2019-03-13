package com.techlabs.interfacecrud.test;

import com.techlabs.interfacecrud.CustomerDB;
import com.techlabs.interfacecrud.ICrudable;
import com.techlabs.interfacecrud.InvoiceDB;
import com.techlabs.interfacecrud.OrderDB;

public class TestICrudable {

	public static void main(String[] args) {
		ICrudable x;
		x = new InvoiceDB();
		doDBOperations(x);
		x = new OrderDB();
		doDBOperations(x);
		x = new CustomerDB();
		doDBOperations(x);
	}
	public static void doDBOperations(ICrudable i) {
		i.create();
		i.read();
		i.update();
		i.delete();
	}

}
