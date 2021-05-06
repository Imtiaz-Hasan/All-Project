import java.lang.*;
import java.util.*;

public class ExceptionDemo
{
	private int x, y;
	private String s;
	public static void main(String args[])
	{
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		ExceptionDemo ed = new ExceptionDemo();
		/* 
		boolean flag = false;
		boolean stackPrint = true;
		do{
		//InputMismatchException
			try{
			sc = new Scanner(System.in);
			System.out.print("Please Enter an Integer: ");
			ed.x = sc.nextInt();
			System.out.print("Please Enter an Integer: ");
			ed.y = sc.nextInt();
			System.out.println(ed.x+ed.y);
			flag=true;
			}
			catch(InputMismatchException e){
				System.out.println("InputMismatchException Handled");
				System.out.println("You should Try again");	
				if(stackPrint)
				e.printStackTrace();
			}
		
		}while(!flag);
 */
		//ArithmeticException
 	
		try{
			System.out.print("Please Enter an Integer: ");
			ed.x = sc.nextInt();
			System.out.print("Please Enter an Integer: ");
			ed.y = sc.nextInt();
			if(ed.y==0) throw new Exception("DivideByZero");
			System.out.println(ed.x/ed.y);
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException Handled");
			
		}
		catch(InputMismatchException e){
			System.out.println("InputMismatchException Handled");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Finally We are here");
		}
		
		//NullPointerException
	
/*	
		System.out.println(ed.s.length());
		System.out.println(ed.s.isEmpty());
		
 		
		
		//NumberFormatException
		
		
 		System.out.print("Please Enter a String: ");
		ed.s = sc.next();
		int i = Integer.parseInt(ed.s);
		System.out.println(i);
*/
		
		//ArrayIndexOutOfBoundsException
		
		// int a[] = new int[]{10,20,30};
		
		// for(int i=0; i<=3; i++)
		// {
			// System.out.println(a[i]);
		// }
		
		
		
		// System.out.println("End");
		
		
	}
}