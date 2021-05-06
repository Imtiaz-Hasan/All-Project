import java.lang.*;
public class Triangle
{
	private double height;
	private double base;
	
	public Triangle ()
	{
		System.out.println("Empty Triangle");
	}
	public Triangle (double height,double base)
	{
		System.out.println("Para Triangle");
		this.height = height;
		this.base = base;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public void setBase(double base)
	{
		this.base = base;
	}
	public double getHeight(){return height;}
	public double getBase(){return base;}
	public double getArea(){return height*base;}
	
	public static void main(String args[])
	{
		Triangle t = new Triangle();
		
		t.setHeight(2.5);
		t.setBase(1.5);
		
		System.out.println("Height: "+t.getHeight());
		System.out.println("Width: "+t.getBase());
		System.out.println("Area: "+t.getArea());
	}
}