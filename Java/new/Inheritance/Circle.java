import java.lang.*;

public class Circle extends Shape
{
	public Circle(){System.out.println("Empty-Circle");}
	public Circle(double x)
	{
		super(x);
		System.out.println("Parameterized-Circle");
	}
	public double getArea()
	{
		return 3.1416 * x * x;
	}
	public void showDetails(){
		System.out.println("Radius x: "+ getX());
		System.out.println("Area :"+this.getArea());
	}
}