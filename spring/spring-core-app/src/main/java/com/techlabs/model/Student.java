package com.techlabs.model;

public class Student {

	private int rollno;
	private String name;
	
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}
}
