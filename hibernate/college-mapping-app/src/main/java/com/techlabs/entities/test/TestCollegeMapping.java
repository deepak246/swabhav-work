package com.techlabs.entities.test;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entities.College;
import com.techlabs.entities.Department;
import com.techlabs.entities.Student;

public class TestCollegeMapping {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		try {
			HashSet<Department> deptSet = new HashSet<Department>();
			HashSet<Student> studSet = new HashSet<Student>();

			College clg = new College("VIT", "Mumbai");

			Department d1 = new Department("CMPN");
			d1.setClg(clg);

			deptSet.add(d1);
			clg.setDepartments(deptSet);

			Student s1 = new Student("deepak");
			s1.setClg(clg);
			s1.setDept(d1);

			studSet.add(s1);
			clg.setStudents(studSet);
			d1.setStudents(studSet);

			session.save(clg);

			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

}
