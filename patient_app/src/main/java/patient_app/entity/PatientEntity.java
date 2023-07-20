package patient_app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@ToString
@Table(name="patient_table")
public class PatientEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private String gender;
	private String address;
	private String disease;
	private String emailid;
	public PatientEntity(String name, int age, String gender, String address, String disease, String emailid) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.disease = disease;
		this.emailid = emailid;
	}
	
	
}
