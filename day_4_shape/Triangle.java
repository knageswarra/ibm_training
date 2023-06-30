package day_4_shape;

public class Triangle implements Shape{
	private int b;
	private int h;
	public Triangle(int b, int h) {
		super();
		this.b = b;
		this.h = h;
	}
	@Override
	public double getArea() {
		return 0.5*b*h;
	}
	
	

}
