package com.techlabs.student;

public class Student {
	private final int rollno;
	private final String name;
	private final int age;
	private static int count;
	
	static {
		count = 100;
		System.out.println("Static block");
	}

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.count++;
		System.out.println("Constructor block");
	}

	public Student(int rollno, String name) {
		this(rollno,name,18);
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public int getCount() {
		return count;
	}
	
	public static int headCount() {
		return count;
	}
	
	public Student whoIsElder(Student secondStudent){
		if(this.age>secondStudent.age)
			return this;
		return secondStudent;
	}

}
