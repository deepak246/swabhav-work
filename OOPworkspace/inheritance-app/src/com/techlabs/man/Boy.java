package com.techlabs.man;

public class Boy extends Man {
	public Boy() {
		super();
		System.out.println("Boy created");
	}
	public void eat() {
		System.out.println("Boy eating");
	}
	@Override
	public void play() {
		System.out.println("Boy playing");
	}
}
