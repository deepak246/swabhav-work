package com.techlabs.interfacecrud;

public class CustomerDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("creating customer DB");
		
	}

	@Override
	public void read() {
		System.out.println("reading from customer DB");
		
	}

	@Override
	public void update() {
		System.out.println("updating customer DB");
		
	}

	@Override
	public void delete() {
		System.out.println("deleting from customer DB");
		
	}

}
