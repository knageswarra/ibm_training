package com.ibm.one_many_mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.one_many_mapping.model.Laptop;
import com.ibm.one_many_mapping.model.Student;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
			SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).buildSessionFactory();
			Session session = sessionFactory.openSession();
			Laptop l1=new Laptop();
			l1.setLid(1);
			l1.setLname("dell");
			
			Laptop l2=new Laptop();
			l2.setLid(2);
			l2.setLname("hp");
			List<Laptop> l=new ArrayList<>();
			l.add(l1);
			l.add(l2);
			Student s1=new Student();
			s1.setMarks(54);
			s1.setStdid(1);
			s1.setName("kanna");
			s1.setLaptops(l);
			l1.setStud(s1);
			l2.setStud(s1);
			session.getTransaction().begin();
			session.save(s1);
			session.getTransaction().commit();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
			

    }
}
