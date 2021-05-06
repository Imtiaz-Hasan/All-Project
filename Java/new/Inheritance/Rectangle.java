import java.lang.*;

public class Rectangle extends Shape
{
	private double y;
	
	public Rectangle(){System.out.println("Empty-Rectangle");}
	public Rectangle(double x, double y)
	{	
		super(x);
		this.y = y;
		System.out.println("Parameterized-Rectangle");
	}
	
	public void setY(double y){this.y = y;}
	public double getY(){return y;}
	
	public double getArea()
	{
		return x * y;
	}
	public void showDetails(){
		System.out.println("x: "+ getX());
		System.out.println("y: "+ getY());
		System.out.println(String.format("%.3f", getArea()));
	}
	
}