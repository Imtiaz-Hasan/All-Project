import java.lang.*;
public class Rectangle
{
	private double length;
	private double width;
	
	public Rectangle()
	{
		System.out.println("Empty Rectangle");
	}
	public Rectangle(double length,double width)
	{
		System.out.println("Para Rectangle");
		this.length = length;
		this.width = width;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	public double getLength(){return length;}
	public double getWidth(){return width;}
	public double getArea(){return length*width;}
	
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		
		r.setLength(2.5);
		r.setWidth(1.5);
		
		System.out.println("Length: "+r.getLength());
		System.out.println("Width: "+r.getWidth());
		System.out.println("Area: "+r.getArea());
	}
}