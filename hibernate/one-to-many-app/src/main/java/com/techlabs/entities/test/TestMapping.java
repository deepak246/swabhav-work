package com.techlabs.entities.test;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entities.Department;
import com.techlabs.entities.Employee;

public class TestMapping {

	public static void main(String[] args) {

		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
        
		try {
			HashSet<Employee> empSet = new HashSet<Employee>();
			Department d1 = new Department("Sales", "Mumbai");
			
			Employee e1 = new Employee("shekhar");
			e1.setDept(d1);
			
			empSet.add(e1);
			d1.setEmployees(empSet);
			session.save(d1);
			
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			session.close();
		}
	}

}
