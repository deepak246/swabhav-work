package com.techlabs.student.test;
import com.techlabs.student.*;
public class TestCount {

	public static void main(String[] args) {
		Student s1 = new Student(101,"A",20);
		System.out.println(s1.getCount());
		Student s2 = new Student(102,"B",15);
		System.out.println(s1.getCount());
		Student s3 = new Student(103,"C");
		System.out.println(s1.getCount());
		System.out.println(Student.headCount());
		
		
	}

}
