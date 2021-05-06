import java.lang.*;
public class Square
{
	private double side;
	
	public void setSide(double side)
	{
		this.side = side;
	}
	public double getSide(){return side;}
	public double getArea(){return (side*side);}
	
	public static void main(String args[])
	{
		Square s = new Square();
		
		s.setSide(4);
		System.out.println("Radius: "+s.getSide());
		System.out.println("Area: "+s.getArea());
	}
}