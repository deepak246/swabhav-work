package com.techlabs.interfacepolymorphism;

public class Man implements IMannerable{

	@Override
	public void wish() {
		System.out.println("Man is greeting hello!!");
	}

	@Override
	public void depart() {
		System.out.println("Man is greeting Goodbye!!");
	}
	public void read() {
		System.out.println("Man is reading");
	}
}
