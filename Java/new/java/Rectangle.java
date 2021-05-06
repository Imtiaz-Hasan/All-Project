import java.lang.*;

public class Rectangle extends Shape
{
	private double  length;
	private double  width;
	
	public Rectangle(){System.out.println("Empty");}
	
	public Rectangle(double  length, double  width){  
		System.out.println("Para Rectangle");
		this.length = length;
		this.width = width;
	}
	
	
	public void setLength(double  length){this.length = length;}
	public void setWidth(double  width){
		this.width = width;
	}
	


	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	double area = length*width;//area
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
		
	   System.out.println("Area of Rectangle is:"+area);
	
	}
}