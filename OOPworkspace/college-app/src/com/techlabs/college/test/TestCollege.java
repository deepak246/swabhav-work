package com.techlabs.college.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.college.Branch;
import com.techlabs.college.College;
import com.techlabs.college.Professor;
import com.techlabs.college.Student;

public class TestCollege {

	public static void main(String[] args) {
		College college = new College();
		Professor professors[] = new Professor[2];
		professors[0] = new Professor(1,"dadar","24/5/2000");
		professors[1] = new Professor(2,"virar","12/3/1988");
		college.addProfessor(professors);
		Student students[] = new Student[3];
		students[0] = new Student(101,"andheri","4/6/1990",Branch.CMPN);
		students[1] = new Student(102,"thane","2/5/1998",Branch.BIOM);
		students[2] = new Student(103,"wadala","5/1/2005",Branch.ETRX);
		college.addStudent(students);
		printDetails(college);
		
	}
	public static void printDetails(College clg) {
		List students = new LinkedList();
		List professors = new LinkedList();
		
		students = clg.getStudents();
		professors = clg.getProfessors();
		System.out.println("College name: "+clg.getClgName());
		for(Iterator i = students.iterator(); i.hasNext(); ) {
			Student student = (Student)i.next();
			System.out.println("========================================");
			System.out.println("Student Id: "+student.getId());
			System.out.println("Student DOB: "+student.getDob());
			System.out.println("Student Address: "+student.getAddress());
			System.out.println("Student Branch:"+student.getBranch());
			
		}
		for(Iterator i = professors.iterator(); i.hasNext(); ) {
			Professor professor = (Professor)i.next();
			System.out.println("========================================");
			System.out.println("Professor Id: "+professor.getId());
			System.out.println("Professor DOB: "+professor.getDob());
			System.out.println("Professor address: "+professor.getAddress());
			System.out.println("Professor salary:"+professor.calculateSalary());
		}
		System.out.println("========================================");
		System.out.println("Total Students = "+clg.getStudentCount());
	}
}
