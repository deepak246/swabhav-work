package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository
public class StudentRepository {
	
	private Student s1, s2, s3;
	private List<Student> students;
	
	public StudentRepository() {
		System.out.println("Repo created");
		students = new ArrayList<Student>();
		s1 = new Student(101,"deepak");
		s2 = new Student(102,"abhi");
		s3 = new Student(103,"shekhar");
		
		addStudent(s1);
		addStudent(s2);
		addStudent(s3);
	}

	private void addStudent(Student s) {
		students.add(s);
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	
}
