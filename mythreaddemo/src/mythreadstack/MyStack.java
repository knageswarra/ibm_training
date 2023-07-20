package mythreadstack;

public class MyStack {
  private int top=-1;
  private char a[]=new char[6];
  
  public void push(char item)
  {
	  synchronized(this)
	  {
		  top++;
		  a[top]=item;
	  }
  }
  public synchronized char pop()
  {
	  return a[top--];
  }
	

}
