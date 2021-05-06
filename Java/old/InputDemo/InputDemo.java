import java.lang.*;
import java.util.Scanner;
import java.io.*;

public class InputDemo
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		
		int i;
		double d;
		String s;
		char c;
		
		//System.out.print("Please Enter a String: ");
		//s = sc.nextLine();
		
		System.out.print("Please Enter an Integer: ");
		i = sc.nextInt();
		
		System.out.print("Please Enter a Double: ");
		d = sc.nextDouble();
		
		System.out.print("Please Enter a String: ");
		s = bfr.readLine();
	
		System.out.print("Please Enter a Char: ");
		c = sc.next().charAt(0);
	
		System.out.println("Your Integer: "+i);
		System.out.println("Your Double: "+d);
		System.out.println("Your String: "+s);
		System.out.println("Your Char: "+c);
	}
}