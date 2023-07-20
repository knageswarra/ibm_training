package com.ibm.mapping_demo_hibernate.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ibm.mapping_demo_hibernate.Address;
import com.ibm.mapping_demo_hibernate.Company;
import com.ibm.mapping_demo_hibernate.Employee;
import com.ibm.mapping_demo_hibernate.factory.MyHibernateFactory;



public class CompanyService {
	private SessionFactory sf;
	private Session session;
	{
		sf=MyHibernateFactory.getSessionFactory();
	}
	
	public Company createCompany()
	{
		Session session=sf.openSession();
		Employee employee1=new Employee(new Random().nextInt(10000), "John", "Doe", "john@email.com"); 
		Employee employee2=new Employee(new Random().nextInt(10000), "Marry", "Public", "marry@email.com");
		Employee employee3=new Employee(new Random().nextInt(10000), "Rahul", "Dravid","rahul@email.com"); 
		Company ibm=new Company(); 
		ArrayList<Employee> list=new ArrayList<Employee>(); 
		list.add(employee1); list.add(employee2);
	    list.add(employee3); 
	    ibm.setCompanyid(UUID.randomUUID().toString());
		ibm.setCompanyname("IBM India"); 
		ibm.setCompaddress(new Address("Banglore", "Karnataka", "banglore", "54321"));
		ibm.setEmps(list);
		session.getTransaction().begin();
		session.save(ibm);
		session.getTransaction().commit();
		return ibm;
	}
	public List<Employee> getAllEmployeesById(String id)
	{	
		List<Employee> emps=new ArrayList<>();
		Session session=sf.openSession();
		Company c=session.find(Company.class, id);
		emps=c.getEmps();
		System.out.println(c);
		return emps;
	}

}
