import java.lang.*;

public class Shape
{
	protected double x;
	
	public Shape(){System.out.println("Empty-Shape");}
	public Shape(double x)
	{	
		System.out.println("Parameterized-Shape");
		this.x = x;
	}
	
	public void setX(double x){this.x = x;}
	public double getX(){return x;}
	
	public double getArea(){return -1.0;}
	
	public void showDetails(){
		System.out.println("Not a specific shape");
	}
}
