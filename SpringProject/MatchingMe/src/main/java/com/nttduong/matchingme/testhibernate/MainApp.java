package com.nttduong.matchingme.testhibernate;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nttduong.matchingme.model.User;

public class MainApp {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory sessionFactory;
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        
        Date date = new Date(1999, 11, 30);
        User u = new User("duong123","pass","Duong",date,"abc@abc",0123,"Male",3);
//        u.setIdProvince(01);
//        u.setIdDistrict(001);
//        u.setIdTown(00001);
        u.setIdDegree(2);
        
        session.save(u);
        tx.commit();
        session.close();
	}
}
