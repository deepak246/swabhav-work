package com.techlabs.crud;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Candidate;

public class CandidateCRUD {

	public static void main(String[] args) {
		// getCandidate(1);
		// deleteCandidate();
		updateCandidate();
	}

	private static void updateCandidate() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Query query = session.createQuery("update Candidate set name = :Name1" + " where name = :Name2");
		query.setParameter("Name1", "Deepak");
		query.setParameter("Name2", "Shekhar");
		int result = query.executeUpdate();
	}

	public static Candidate getCandidate(long id) {
		Candidate c = null;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		c = (Candidate) session.get(Candidate.class, id);

		System.out.println("id = " + c.getId());
		System.out.println("name = " + c.getName());
		System.out.println("cgpa = " + c.getCgpa());
		return c;
	}

	public static void deleteCandidate() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Query query = session.createQuery("delete from Candidate where id=1");
		// specifying class name (Emp) not tablename
		query.executeUpdate();
		System.out.println("deleted successfully ");
	}
}
