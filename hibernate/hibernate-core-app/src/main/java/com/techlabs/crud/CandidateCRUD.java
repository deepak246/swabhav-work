package com.techlabs.crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Employee;

public class CandidateCRUD {

	public static void main(String[] args) {
		System.out.println("==============candidate details===============");
		// getCandidates();
		deleteCandidate(2);
		System.out.println("==============candidate deleted===============");
		System.out.println("==============candidate details===============");
		// getCandidates();
		//updateCandidate(2);
	}

	private static void updateCandidate(int id) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee candidate = (Employee) session.get(Employee.class, id);
		candidate.setName("Sweety Rajput");
		System.out.println("Updated Successfully");
		session.getTransaction().commit();
		//sessionFactory.close();
	}

	public static void getCandidates() {
		// Candidate c = null;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		// c = (Candidate) session.get(Candidate.class, id);

		Query query = session.createQuery("from Candidate");

		List<Employee> candidates = query.list();
		for (Employee c : candidates) {
			System.out.print("id = " + c.getId());
			System.out.print(" name = " + c.getName());
			System.out.print(" cgpa = " + c.getCgpa());
			System.out.println();
		}
	}

	public static void deleteCandidate(int id) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee candidate = (Employee) session.load(Employee.class, id);
		session.delete(candidate);
		session.getTransaction().commit();

		System.out.println("deleted successfully ");
	}
}
