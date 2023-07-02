package collection;

import java.util.Set;

public interface EmployeeSer {

	public void createEmployee(Employee e);
	
    public Set<Employee> getAllEmployees();
	
	public Employee findEmployeeById(String id);
}
