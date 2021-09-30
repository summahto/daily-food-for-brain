package com.sumit.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
	{
		List<Laptop> laps = new ArrayList<Laptop>();
		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");

		laps.add(laptop);

		Student sumit = new Student();
		sumit.setName("Sumit");
		sumit.setRollNo(1);
		sumit.setMarks(95);
		sumit.setLaptops(laps);

		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		SessionFactory sf = config.buildSessionFactory(reg);
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.save(sumit);
		session.save(laptop);

		tx.commit();
		session.close();
	}
}
