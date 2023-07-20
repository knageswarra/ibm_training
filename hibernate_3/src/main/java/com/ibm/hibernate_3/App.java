package com.ibm.hibernate_3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.hibernate_3.model.InternationalCD;
import com.ibm.hibernate_3.model.SpecialCD;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(InternationalCD.class).addAnnotatedClass(SpecialCD.class).buildSessionFactory();
        Session session=sessionFactory.openSession();
        InternationalCD iCd=new InternationalCD("Name-A","French");
        SpecialCD sCD=new SpecialCD("Name-B","3D");
        session.getTransaction().begin();
        session.save(iCd);
        session.save(sCD);
        session.getTransaction().commit();
        System.out.println("done");
    }
}
