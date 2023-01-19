package com.vicky.Hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
	public static void main( String[] args ){

		Alien gokul = new Alien();
		gokul.setA_Colour("Green");
		gokul.setA_Id(12345);
		gokul.setA_Name("Irul");

		System.out.println(gokul);

		Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
		ServiceRegistry srg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(srg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();

		session.persist(gokul);
System.out.println("Hello......");
		//		Retrieve Data from Database - as Object & Print
		//		vicky = (Alien) session.get(Alien.class, 4);

		tx.commit();
		System.out.println("olleH......");
	}
}
