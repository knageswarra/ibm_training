package stackqueue;

public class MyQueue {
	private int f=-1;
	private int r=-1;
	private int q[]=new int[6];
	
	public synchronized void insert(int item)
	{
		if(f==-1 || r==-1)
		{
			f=r=0;
			q[r]=item;
		}
		else
		{
			q[++r]=item;
		}
	}
	public synchronized int delete()
	{
		return q[f++];
	}
}
