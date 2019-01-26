package com.techlabs.student.test;
import com.techlabs.student.*;
public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student(101,"A",20);
		printDetails(s1);
		Student s2 = new Student(102,"B");
		printDetails(s2);
		
		Student elder = s1.whoIsElder(s2);
		printDetails(elder);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(elder.hashCode());
	}
	public static void printDetails(Student s) {
		System.out.println("Rollno="+s.getRollno()+" Name="+s.getName()+" Age="+s.getAge());
	}

}
