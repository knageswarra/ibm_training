package com.ibm.hibernate_demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.hibernate_demo2.model.Car;
import com.ibm.hibernate_demo2.model.MotorCycle;
import com.ibm.hibernate_demo2.model.RoadVehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    try {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(RoadVehicle.class).addAnnotatedClass(Car.class)
				.addAnnotatedClass(MotorCycle.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		 session.getTransaction().begin(); 
		 session.save(new RoadVehicle());
		  session.getTransaction().commit();
		
		session.getTransaction().begin();
		
		  session.save(new Car());
		  session.save(new MotorCycle());
		  session.getTransaction().commit();
		 
		System.out.println("done");

	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
