package comparable1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Tester {
	public static void main(String args[])
	{
		Employee e1=new Employee(1,"nagesh","rao","nage2gmail.com",5000);
		Employee e2=new Employee(2,"munna ","rao","jhdbs@gmail.com",2500);
		
		Employee e3=new Employee(2,"nagesh ","rao","jhdbs@gmail.com",6500);
		
		List<Employee> e=new ArrayList<>();
		e.add(e3);
		e.add(e2);
		e.add(e1);
		Collections.sort(e);
		
		System.out.println(e);
	}

}
