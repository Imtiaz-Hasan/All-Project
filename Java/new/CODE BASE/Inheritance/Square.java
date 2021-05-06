import java.lang.*;

public class Square extends Shape
{
	public Square(){System.out.println("Empty-Square");}
	public Square(double x)
	{
		super(x);// constructor of super class 
		System.out.println("Parameterized-Square");
	}
	
	//overriding methods of super class
	public double getArea()
	{
		return getX() * getX();
	}
	public void showDetails(){
		System.out.println("x: "+ getX());
		System.out.println("Area :"+ getArea());
	}

}

