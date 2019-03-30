package com.techlabs.collection.set;

import java.util.Comparator;

public class Student implements Comparable{
	private int rollno;
	private int standard;
	private String firstname, lastname;

	public Student(int rollno, int standard, String firstname, String lastname) {
		this.rollno = rollno;
		this.standard = standard;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public int getRollno() {
		return rollno;
	}

	public int getStandard() {
		return standard;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Student student = (Student) obj;

		return ((student.rollno == this.rollno) && (student.standard == this.standard));
	}

	@Override
	public int hashCode() {
		return this.rollno;
	}
	
	@Override
    public int compareTo(Object obj) {
		Student student = (Student)obj;
		
		return Comparator.comparing(Student::getFirstname)
	              .thenComparing(Student::getLastname)
	              .thenComparingInt(Student::getStandard)
	              .compare(this, student);
	    
        //return this.rollno - student.getRollno();
    }
	@Override
	public String toString() {
		return "Name = " + this.firstname + ", LastName = " + this.lastname + 
				", Rollno = " +this.rollno + ", STD = "+ this.standard + ";";
	}
	
}
