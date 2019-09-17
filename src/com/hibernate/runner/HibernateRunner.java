package com.hibernate.runner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.modal.UserDetails;

public class HibernateRunner {

	public static void main(String[] args) {
		
		UserDetails obj = new UserDetails();
		obj.setUserId(01);
		obj.setUserName("devashish");
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		
	}

}
