package day_4_shape;

public class Rectangle implements Shape {
	private int l;
	private int b;
	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return l*b;
	}
	
 
}
