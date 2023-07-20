package stackqueue;

public class MyStack {
	  private int top=-1;
	  private int s[]=new int[6];
	  
	  public void push(int item)
	  {
		  synchronized(this)
		  {
			  top++;
			  s[top]=item;
		  }
	  }
	  public synchronized int pop()
	  {
		  return s[top--];
	  }
		

}


