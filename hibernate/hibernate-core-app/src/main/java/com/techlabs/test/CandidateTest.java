package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Candidate;

public class CandidateTest {

	public static void main(String[] args) {

		List<Candidate> results = new ArrayList<Candidate>();

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();


		try {

			Candidate c1 = new Candidate("shekhar", 8.9f);
			session.save(c1);
			Candidate c2 = new Candidate("abhi", 9.9f);
			session.save(c2);
			transaction.commit();
			for (Candidate c : results) {
				System.out.println("List of Employees::" + c.getId() + "," + c.getName());
			}
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			session.close();
		}
		
	}

}
