import java.lang.*;

public class Triangle extends Shape
{
	private double base;
	private double height;
	
	public Triangle(){}
public Triangle(double  base, double  height)
	
	{  
		System.out.println("Parameterized Triangle");
		this.base = base;
		this.height = height;
	}
    
	public void setBase(double base)
	
	{
		this.base = base;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getBase(){return base;}
	public double getHeight(){return height;}
	double area = (base* height)/2;//area
     
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Base: "+base);
		System.out.println("Height: "+height);
		
		
	   System.out.println("Area of Triangle is: " + area);
	
	}
}	