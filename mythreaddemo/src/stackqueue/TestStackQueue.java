package stackqueue;

import java.util.Scanner;

public class TestStackQueue implements Runnable{
	private Scanner sc;
	private MyQueue myq;
	private MyStack mys;
	{
		myq= new MyQueue();
		mys=new MyStack();
		sc=new Scanner(System.in);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter how many elements u want to add to stack");
		int n=sc.nextInt();
	    int x=20;
	    try 
	    {
	         for(int i=1;i<=n;i++)
	         {
	    	     mys.push(x++);
	         }
	         System.out.println("enter how many elements u want to add to queue that are popped from the stack");
	  	     int qn=sc.nextInt();
	  	     if(qn>n)
	  	     {
	  	    	throw new InSufficientException("sufficient elements are not present");
	  	     }
	  	     else
	  	     {
	  	    	for(int i=1;i<=qn;i++)
	  	    	{
	  	    	myq.insert(mys.pop());
	  	    	}
	  	    }
	  	    System.out.println("how many elements u want to delete from the queue");
	  	    int z=sc.nextInt();
	  	    if(z>qn)
	  	    {
	  	    	throw new InSufficientException("sufficient elements are not present");
	  	    }
	  	    try 
	  	    {
	  	    	for(int i=1;i<=z;i++)
	  	    	{
	  	    		System.out.println(myq.delete());
	  	    	}
	  	    }
	  	    catch(ArrayIndexOutOfBoundsException e)
	  	    {
	  	    	System.err.println("u dont have any more elements to delete");
	  	    }
	    
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.err.println("size should be equal to or less than 6");
	    }
	    
		
	}
	

}
