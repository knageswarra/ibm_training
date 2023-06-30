package day_4_shape;

public class Calculate {
	public static void main(String args[])
	{
		Triangle t=new Triangle(5,6);
		System.out.println(t.getArea());
		Rectangle r=new Rectangle(6,4);
		System.out.println(r.getArea());
		Circle c=new Circle(5);
		System.out.println(c.getArea());
	}

}
