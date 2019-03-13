package com.techlabs.college;

import java.util.LinkedList;
import java.util.List;

public class College {
	private String clgName = "VIT";
	private List students;
	private List professors;
	private static int numberOfStudents = 0;
	public College() {
		students = new LinkedList();
		professors = new LinkedList();
	}
	public void addStudent(Student[] student) {
		
		for(int i=0;i<student.length;i++) {
			students.add(student[i]);
			numberOfStudents++;
		}
	}
	public List getStudents() {
		return students;
	}
	public String getClgName() {
		return clgName;
	}
	public void addProfessor(Professor[] professor) {
		for(int i=0;i<professor.length;i++)
			professors.add(professor[i]);
	}
	public List getProfessors() {
		return professors;
	}
	public int getStudentCount() {
		return numberOfStudents;
	}
}
