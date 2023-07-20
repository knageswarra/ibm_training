package com.ibm.hibernate_3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.hibernate_3.model.Department;
import com.ibm.hibernate_3.model.Employee;


public class EmpDeptApp {
	public static void main(String args[])
	{
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Department d=new Department();
		d.setDepartmentname("IT");
		d.setId(1);
		d.setLocation("bangalore");
		Employee e=new Employee();
		e.setDept(d);
		e.setEmpid(1);
		e.setName("ashok");
		e.setSal(50000);
		session.getTransaction().begin();
        session.save(e);
        session.getTransaction().commit();
		
		
	}

}
