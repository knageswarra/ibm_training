package patient_app.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import patient_app.entity.PatientEntity;
import patient_app.factory.MyHibernateFactory;

public class PatientSerImp implements PatientSer {
	
	private Session session=null;
	{
	  try {
		session=MyHibernateFactory.getConnection();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	

	@Override
	public List<PatientEntity> listAll() 
	{
		TypedQuery<PatientEntity> query=session.createQuery("from PatientEntity p",PatientEntity.class);
		List<PatientEntity> l=query.getResultList();
		return l;
		
		
	}

	@Override
	public void create(PatientEntity pe) {
		session.getTransaction().begin();
		session.save(pe);
		session.getTransaction().commit();
		
	}

	@Override
	public PatientEntity identifyById(int id) {
		// TODO Auto-generated method stub
		PatientEntity p=session.get(PatientEntity.class,id);
		return p;
	}

}
