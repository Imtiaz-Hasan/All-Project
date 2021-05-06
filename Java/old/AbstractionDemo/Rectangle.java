import java.lang.*;

public class Rectangle extends Shape
{
	private double y;
	
	public Rectangle(){System.out.println("Empty-Rect");}
	
	public Rectangle(double x, double y)
	{
		super(x);
		this.y = y;
		System.out.println("Pera-Rect");
	}
	public void setY(double y)
	{
		this.y=y;
	}
	public double getY(){return y;}
	
	public double getArea(){return x * y;}
	
}




