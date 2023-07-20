package com.ibm.mapping_demo_hibernate.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.mapping_demo_hibernate.Company;
import com.ibm.mapping_demo_hibernate.Employee;


public class MyHibernateFactory {
private static SessionFactory msf;
	
	public static SessionFactory getSessionFactory()
	{
		msf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Company.class)
				
				.buildSessionFactory();
		return msf;
	}
}
