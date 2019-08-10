package com.techlabs.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Student;

@Repository("studentRepository")
public class StudentRepository {

	@Autowired
	SessionFactory sessionFactory;
	Session session;
	Transaction tr;
	
	public StudentRepository() {
		System.out.println("repo");
	}
	
	public void add(Student student) {
		session = sessionFactory.openSession();
		tr = session.beginTransaction();
		session.save(student);
		tr.commit();
	}
	
	public void readStudents() {
		session = sessionFactory.openSession();
		tr = session.beginTransaction();
		
		Query query = session.createQuery("from Student");
		
		List<Student> students = query.list();
		//System.out.println("for = "+students.size());
		for (Student s : students) {
			System.out.print("id = " + s.getId());
			System.out.print(" name = " + s.getName());
			System.out.println();
		}

	}
	
}
