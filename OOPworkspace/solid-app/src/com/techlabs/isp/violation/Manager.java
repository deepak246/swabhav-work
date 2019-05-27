package com.techlabs.isp.violation;

public class Manager implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Manager starts working");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager stops working");
	}

	@Override
	public void startEat() {
		System.out.println("Manager starts Eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager stops Eating");
	}
	
}
