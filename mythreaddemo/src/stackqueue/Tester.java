package stackqueue;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStackQueue tsq=new TestStackQueue();
		Thread t1=new Thread(tsq);
		try
		{
			t1.start();
		}
		catch(InSufficientException e)
		{
			System.err.println(e.getErrmsg());
		}
		TestStackQueue tsq1=new TestStackQueue();
		Thread t2=new Thread(tsq1);
		try
		{
			t2.start();
		}
		catch(InSufficientException e)
		{
			System.err.println(e.getErrmsg());
		}
		

	}

}
