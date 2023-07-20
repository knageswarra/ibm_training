package mythreadqueue;

public class MyQueue {
	private int f=-1;
	private int r=-1;
	private int q[]=new int[6];
	
	public void insert(int item)
	{
		if(f==-1 && r==-1)
		{
			f=r=1;
		}
		else
		{
			q[++r]=item;
		}
	}
	public int delete()
	{
		return q[f++];
	}

}
