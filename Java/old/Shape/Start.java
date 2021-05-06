import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		
		r1.setX(10.0);
		r1.setY(7.5);
		
		System.out.println("R1 Length: "+r1.getX());
		System.out.println("R1 Width: "+r1.getY());
		System.out.println("R1 Area: "+r1.getArea());
		
		System.out.println("---------------------------");
		
		Rectangle r2 = new Rectangle(10.5,7.0);
		
		System.out.println("R2 Length: "+r2.getX());
		System.out.println("R2 Width: "+r2.getY());
		System.out.println("R2 Area: "+r2.getArea());
		
		System.out.println("---------------------------");
		
		
	}
}