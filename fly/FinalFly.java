package fly;

public class FinalFly {

	public static void main(String args[])
	{
		Fly flies[]= {new Airplane(),new Helicopter(),new SpaceCraft()};
		for(Fly f:flies)
		{
			f.fly();
		}
	}
}
