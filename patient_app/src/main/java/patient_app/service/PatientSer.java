package patient_app.service;

import java.util.List;

import patient_app.entity.PatientEntity;

public interface PatientSer {
	public List<PatientEntity> listAll();
	
	public void create(PatientEntity pe);
	
	public PatientEntity identifyById(int id);
	

}
