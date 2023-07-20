package mythreadstack;

import java.util.Scanner;

public class TestStack implements Runnable {
	private Scanner sc=new Scanner(System.in);
	private MyStack mystack;
	{
		mystack=new MyStack();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Enter how many elements u want to add to stack");
		int n=sc.nextInt();
	    char a='a';
	    try {
	    for(int i=1;i<=n;i++)
	    {
	    	mystack.push(a++);
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
	    	System.out.println(mystack.pop());
	    }
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.err.println("u cannot any more elements");
	    }
		
	}

}
