package mythreadqueue;

import java.util.Scanner;

public class TestQueue implements Runnable{

	Scanner sc=new Scanner(System.in);
	private MyQueue myqueue;
	{
		myqueue=new MyQueue();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter how many elements u want to add to stack");
		int n=sc.nextInt();
	    int a=20;
	    try {
	    for(int i=1;i<=n;i++)
	    {
	    	myqueue.insert(a++);
	    }
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.err.println("size should be equal to or less than 6");
	    }
	    System.out.println("how many elements u want to retrieve");
	    int z=sc.nextInt();
	    try {
	    for(int i=1;i<=z;i++)
	    {
	    	System.out.println(myqueue.delete());
	    }
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.err.println("u cannot any more elements");
	    }
		
	}

}
