import java.lang.*;
import classes.Circle.*;
import classes.Rectangle.*;
import classes.Triangle.*;
import classes.Shape.*;
import classes.Inventory.*;
import interfaces.*;
import java.util.Scanner;

// class keyword and class_name
//if we use public keyword the file_name.java has to be
// class body starts and ends with { }

public class Start
{
	
	void test() throws MyException{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if(s.length() > 5)
			{
				System.out.println("Invalid String");
				throw new MyException();
			}
			else
			{
				System.out.println("Valid String");
			}

		
	}
	public static void main(String args[])
	{
		Shape s = new Rectangle(13.3,6.2);
		s.setTypeofShape("Rectangle");// invoking the instance method
		s.showDetails();
		Shape s4 = new Rectangle(11.2,7.6);
		s4.setTypeofShape("Rectangle");// invoking the instance method
		s4.showDetails();
		Shape s5 = new Rectangle(7.4,5.5);
		s5.setTypeofShape("Rectangle");// invoking the instance method
		s5.showDetails();
		Shape s1 = new Triangle(5.5,7.7);
		s1.setTypeofShape("Triangle");// invoking the instance method
		s1.showDetails();
		Shape s6 = new Triangle(8.5,4.4);
		s6.setTypeofShape("Triangle");// invoking the instance method
		s6.showDetails();
		Shape s7 = new Triangle(15.5,13.3);
		s7.setTypeofShape("Triangle");// invoking the instance method
		s7.showDetails();
		Shape s2 = new Circle(12.56);
		s2.setTypeofShape("Circle");// invoking the instance method
		s2.showDetails();
		Shape s8 = new Circle(11.11);
		s8.setTypeofShape("Circle");// invoking the instance method
		s8.showDetails();
		Shape s9 = new Circle(18.6);
		s9.setTypeofShape("Circle");// invoking the instance method
		s9.showDetails();
		Inventory i = new Inventory(15);
		i.insertShape(s);
		
		i.insertShape(s1);
		
		i.insertShape(s2);
		
		i.insertShape(s4);
		
		i.insertShape(s5);
		
		i.insertShape(s6);
		
		i.insertShape(s7);
		
		i.insertShape(s8);
		
		i.insertShape(s9);
		
		i.showAllShapes();
		
		i.removeShape(s4);
		
		i.removeShape(s7);
		
		i.removeShape(s);
		
		i.showAllShapes();
		System.out.println("************************");	
		i.showShapesByType("Rectangle");
		System.out.println("************************");
		i.showShapesByType("Triangle");
		System.out.println("************************");
		i.showShapesByType("Circle");
		System.out.println("************************");
		i.showShapesByType("Shape");
		System.out.println("************************");
		i.showShapesByType("Inventory");
		
		System.out.println("Start");
		//Exception
		Start st = new Start();
		
		try{
		st.test();
		}
		catch(MyException me){
			
		}
		System.out.println("End");
	

		
	}
}