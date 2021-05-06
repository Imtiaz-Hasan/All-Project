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
		//InputMismatchException and ArithmeticException
		try
		{
			System.out.print("Please enter an Integer : ");
			x = sc.nextInt();
			System.out.print("Please enter an Integer : ");
			y = sc.nextInt();
			
			r = x/y;
			System.out.println(r);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Exception Occurred : "+ ime.getMessage());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception Occurred : "+ ae.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception Occurred : "+ e.getMessage());
		}
				
		//NullPointerException and NumberFormatException
		
		try
		{
			if(x<10)
			{
				int i = ed.s.length();
				System.out.println(i);
			}
			else
			{
				System.out.print("Please Enter a String : ");
				ed.s = sc.next();
				int i = Integer.parseInt(ed.s);
				System.out.println(i);
			}
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception Occurred : "+ npe.getMessage());
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Exception Occurred : "+ nfe.getMessage());
		}
		
		//ArrayIndexOutOfBoundsException
		/*
		int a[] = new int []{1,2,3};
		try
		{
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Exception Occurred");
		}
		*/	
		System.out.println("------END------");
	}
}