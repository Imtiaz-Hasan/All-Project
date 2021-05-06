import java.lang.*;

public class Square extends Shape
{
	public Square(){System.out.println("Empty-Square");}
	
	public Square(double x)
	{
		super(x);
		System.out.println("Pera-Square");
	}
	public double getArea()
	{
		return x * x;
	}
}