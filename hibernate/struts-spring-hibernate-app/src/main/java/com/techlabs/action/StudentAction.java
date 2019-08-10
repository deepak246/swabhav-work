package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.entity.Student;
import com.techlabs.service.StudentService;

public class StudentAction implements Action {
	
	@Autowired
	StudentService svc;
	
	public StudentAction() {
		System.out.println("Student Action");
	}

	@Override
	public String execute() throws Exception {
		Student student = new Student();
		//student.setId(1);
		student.setName("Deepak");
		//svc.addStudent(student);
		svc.getStudents();
		
		return this.SUCCESS;
	}

}
