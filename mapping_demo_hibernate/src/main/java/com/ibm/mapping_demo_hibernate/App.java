package com.ibm.mapping_demo_hibernate;

import java.util.List;
import java.util.Scanner;

import com.ibm.mapping_demo_hibernate.service.CompanyService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	CompanyService cs=new CompanyService();
    	while(true)
    	{
        System.out.println("1.to create a company");
        System.out.println("2.to view all the employess under a specific company with id");
        System.out.println("enter ur choice");
        int ch=sc.nextInt();
        switch(ch)
        {
        case 1:
        	Company c=cs.createCompany();
        	System.out.println(c);
        	break;
        case 2:
        {
        	List<Employee> l=cs.getAllEmployeesById("c3ccb1c0-f9ca-4fae-9f56-948b188183d8");
        	for(Employee e:l)
        		System.out.println(e);
        	break;
        }
        default:
        	System.out.println("u entered invalid choice");
        	break;
        	
        	
        }
    }
    }
}
