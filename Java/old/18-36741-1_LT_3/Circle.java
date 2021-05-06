import java.lang.*;
public class Circle
{
	private double radius;
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getRadius(){return radius;}
	public double getArea(){return 3.1416*(radius*radius);}
	
	public static void main(String args[])
	{
		Circle c = new Circle();
		
		c.setRadius(2);
		System.out.println("Radius: "+c.getRadius());
		System.out.println("Area: "+c.getArea());
	}
}