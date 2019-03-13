package com.techlabs.interfacecrud;

public class OrderDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("creating order DB");
		
	}

	@Override
	public void read() {
		System.out.println("reading from order DB");
		
	}

	@Override
	public void update() {
		System.out.println("updating order DB");
		
	}

	@Override
	public void delete() {
		System.out.println("deleting from Order DB");
		
	}

}
