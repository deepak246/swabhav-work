package com.techlabs.simplefactory;

class Tesla implements IAutomobile{

	@Override
	public void start() {
		System.out.println("Tesla start");
	}

	@Override
	public void stop() {
		System.out.println("Tesla stop");
	}

}
