package com.ibm.hibernate_demo2;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.hibernate_demo2.model.Order;
import com.ibm.hibernate_demo2.model.Shipment;


public class OrderShipmentApp {
	public static void main(String args[])
	{
	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Order.class).addAnnotatedClass(Shipment.class).buildSessionFactory();
	Session session = sessionFactory.openSession();
	Shipment shipment = new Shipment();
	shipment.setCityname("bengal");
	shipment.setZipcode(56004);
	shipment.setShipmentid(new Random().nextInt(100));
	Order order = new Order();
	order.setId("125");
	order.setOrdername("Laptop");
	order.setShipment(shipment);
	session.getTransaction().begin();

	//session.save(shipment);
	session.save(order);

	//Order order2 = session.get(Order.class, "124");
	//session.remove(order2);
	session.getTransaction().commit();
	System.out.println("done");
	}
}
