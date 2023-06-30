package day_4_shape;

public class Circle implements Shape{
  private int r;

public Circle(int r) {
	super();
	this.r = r;
}

@Override
public double getArea() {
	// TODO Auto-generated method stub
	return Math.PI*r*r;
}
  
}
