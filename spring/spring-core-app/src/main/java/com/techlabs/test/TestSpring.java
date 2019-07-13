package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.service.StudentService;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService svc = context.getBean("studentService", StudentService.class);
		System.out.println(svc.getStudentsList().size());
		StudentService svc1 = context.getBean("studentService", StudentService.class);
		System.out.println(svc1.getStudentsList().size());
	}

}
