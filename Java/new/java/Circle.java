import java.lang.*;

public class Circle extends Shape
{
	double radius;
	
	public Circle()
	{
	   System.out.println("");
		
	}
	
	public Circle(double radius)
	
	{  
		System.out.println("Circle");
		
		this.radius = radius;
	}
	
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	double area = Math.PI * (radius * radius);//area
      
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Radius: "+radius);
		System.out.println("The area of circle is: " + area);
	}
}