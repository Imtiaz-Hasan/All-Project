import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		//Shape s1 = new Shape();
		
		Shape s1 = new Rectangle(12.5, 10.5);
		System.out.println(s1.getArea());
		
		s1 = new Triangle(10.5, 8.3);
		System.out.println(s1.getArea());
		
	}
}