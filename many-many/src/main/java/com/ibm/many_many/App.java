package com.ibm.many_many;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).addAnnotatedClass(Course.class).buildSessionFactory();
        try {
		Session session = sessionFactory.openSession();
		Course course1 = new Course();
		course1.setCourseName("React");
		Course course2 = new Course();
		course2.setCourseName("Jenkins");
		Student student1 = new Student();
		student1.setName("Rahul");
		Student student2 = new Student();
		student2.setName("Brian");
		List<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		Collection<Student> students=new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		
		student1.setCourses(courses);
		student2.setCourses(courses);
		session.getTransaction().begin();
		session.save(student1);
		session.save(student2);
		session.getTransaction().commit();
		System.out.println("done");

	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
    }
}
