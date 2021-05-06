import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
        Rectangle r = new Rectangle();
		
		r.setLength(2.5);
		r.setWidth(1.5);
		
		System.out.println("    Rectangle");
		System.out.println("Length: "+r.getLength());
		System.out.println("Width: "+r.getWidth());
		System.out.println("Area: "+r.getArea());
		
		Triangle t = new Triangle();
		
		t.setHeight(2.5);
		t.setBase(1.5);
		
		System.out.println("    Triangle");
		System.out.println("Height: "+t.getHeight());
		System.out.println("Width: "+t.getBase());
		System.out.println("Area: "+t.getArea());
		
		Circle c = new Circle();
		
		c.setRadius(2);
		
		System.out.println("    Circle");
		System.out.println("Radius: "+c.getRadius());
		System.out.println("Area: "+c.getArea());
		
		Square s = new Square();
		
		s.setSide(4);
		System.out.println("    Square");
		System.out.println("Radius: "+s.getSide());
		System.out.println("Area: "+s.getArea());
	}
}