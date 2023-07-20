package mythreadstack;

public class Tester {
  public static void main(String args[])
  {
	  TestStack ts=new TestStack();
	  Thread t1= new Thread(ts);
	  t1.start();
	  try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  Thread t2=new Thread(ts);
	  t2.start();
  }
}
