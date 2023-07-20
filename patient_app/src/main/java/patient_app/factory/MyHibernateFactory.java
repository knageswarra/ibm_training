package patient_app.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import patient_app.entity.PatientEntity;

public class MyHibernateFactory {
	private static SessionFactory sf;
	
	private static Session session;
	
	public static Session getConnection()throws Exception
	{
       sf=new Configuration().configure().addAnnotatedClass(PatientEntity.class).buildSessionFactory();
		
		session=sf.openSession();
		return session;
	}

}
