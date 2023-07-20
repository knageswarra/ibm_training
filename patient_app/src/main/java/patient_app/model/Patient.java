package patient_app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Patient {
	private String name;
	private int age;
	private String gender;
	private String address;
	private String disease;
	private String emailid;

}
