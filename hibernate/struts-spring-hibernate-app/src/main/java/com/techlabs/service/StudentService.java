package com.techlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Student;
import com.techlabs.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repo;
	
	public StudentService() {
		System.out.println("service");
	}
	
	public void addStudent(Student student) {
		repo.add(student);
	}
	
	public void getStudents() {
		repo.readStudents();
	}
}
