package mythreadqueue;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestQueue tq=new TestQueue();
		Thread t1=new Thread(tq);
		t1.start();
		Thread t2=new Thread(tq);
		t2.start();

	}

}
