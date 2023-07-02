package collection;

import java.util.Iterator;
import java.util.Set;

public class Tester {
	public static void main(String args[])
	{
		EmployeeSerImp esi=new EmployeeSerImp();
	    Employee e1=new Employee();
	    e1.setEmpid("1");
	    e1.setFname("nages");
	    e1.setLname("rao");
	    e1.setEmail("nages@gmail.com");
	    esi.createEmployee(e1);
	    Employee e2=new Employee();
	    e2.setEmail("munna@gmail.com");
	    e2.setEmpid("2");
	    e2.setFname("munna");
	    e2.setLname("rao");
	    esi.createEmployee(e2);
	    Employee e3=new Employee();
	    e3.setEmpid("1");
	    e3.setFname("nages");
	    e3.setLname("rao");
	    e3.setEmail("nages@gmail.com");
	    esi.createEmployee(e3);
	    
	    
	    Set<Employee> s1=esi.getAllEmployees();
	    Iterator<Employee> i=s1.iterator();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
	    Employee tEmployee=esi.findEmployeeById("1");
		if(tEmployee==null)
		{
			System.out.println("  not found");
			
		}
		else
		{
			System.out.println("found"+tEmployee);
		}
	}
}
