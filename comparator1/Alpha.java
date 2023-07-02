package comparator1;

import java.util.Comparator;

public class Alpha implements Comparator<Employee> {

	@Override
	public int compare(Employee a,Employee b) {
		// TODO Auto-generated method stub
		if(a.getSalary()>b.getSalary())
		       return 1;
		else
			return -1;
	}
	

}
