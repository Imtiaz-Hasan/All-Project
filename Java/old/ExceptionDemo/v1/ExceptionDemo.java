import java.lang.*;
import java.util.*;

public class ExceptionDemo
{
	String s;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ExceptionDemo ed = new ExceptionDemo();
		int x=10, y=0, r;
		
		System.out.println("------Start------");
		//InputMismatchException
		/*try
		{
			System.out.print("Please enter an Integer : ");
			x = sc.nextInt();
			System.out.print("Please enter an Integer : ");
			y = sc.nextInt();
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Exception Occurred");
		}*/
		
		//ArithmeticException
		/*
		try
		{
			r = x/y;
			System.out.println(r);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception Occurred");
		}
		*/
		
		//NullPointerException
		/*
		try
		{
			int i = ed.s.length();
			System.out.println(i);
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception Occurred");
		}
		*/
		
		//NumberFormatException
		/*
		System.out.print("Please Enter a String : ");
		ed.s = sc.next();
		try
		{
			int i = Integer.parseInt(ed.s);
			System.out.println(i);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Exception Occurred");
		}
		*/
		//ArrayIndexOutOfBoundsException
		int a[] = new int []{1,2,3};
		try
		{
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Exception Occurred");
		}
			
		System.out.println("------END------");
	}
}