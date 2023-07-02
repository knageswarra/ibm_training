package collection;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSerImp implements  EmployeeSer{

	private Set<Employee> emps;
	
	public EmployeeSerImp()
	{
		emps=new HashSet<Employee>();
	}
	@Override
	public void createEmployee(Employee e) {
		// TODO Auto-generated method stub
		emps.add(e);
		
	}

	@Override
	public Set<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return emps;
	}

	@Override
	public Employee findEmployeeById(String id) {
		// TODO Auto-generated method stub
		Employee emp1=null;
		for(Employee e:emps)
		{
			if(e.getEmpid().equals(id))
			{
				emp1=e;
				break;
			}
		}
		return emp1;
	}
	

}
