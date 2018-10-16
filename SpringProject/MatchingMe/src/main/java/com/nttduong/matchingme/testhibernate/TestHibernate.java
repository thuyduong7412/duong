package com.nttduong.matchingme.testhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.nttduong.matchingme.model.User;

public class TestHibernate {
	public static void main(String[] args) {
		System.out.println(checkLogin("duong123", "abc"));
	}

	@SuppressWarnings({ "deprecation" })
	static boolean checkLogin(String username, String password) {
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure() // configures settings from hibernate.cfg.xml
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		String hql = "FROM com.nttduong.matchingme.model.User U WHERE U.username = :username AND U.password = :password";
		@SuppressWarnings("unchecked")
		Query<User> query = session.createQuery(hql);
		query.setParameter("username", username);
		query.setParameter("password", password);
		User a = query.uniqueResult();
		tx.commit();
		session.close();
		if (a == null) {
			return false;
		} else {
			return true;
		}
	}

}
