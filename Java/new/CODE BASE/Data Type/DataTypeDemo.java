import java.lang.*;

public class DataTypeDemo
{
	boolean b1;
	char c1, c2;
	float f1, f2, f3, f4;
	double d1, d2, d3, d4;
	byte bt1, bt2;
	short s1, s2;
	int i1, i2;
	long l1, l2;
	
	public static void main(String args[])
	{
		DataTypeDemo dtd = new DataTypeDemo();
		
		System.out.println("");
		System.out.println("Default Value of boolean: "+dtd.b1);
		
		System.out.println("");
		System.out.println("Default Value of char: "+dtd.c1);
		
		dtd.c1 = '\u0000';
		System.out.println("Lowest Range of char: "+dtd.c1);
		dtd.c2 = '\uFFFF';
		System.out.println("Highest Range of char: "+dtd.c2);
		//you can see the whole list in this link https://unicode-table.com/en/
		 
		System.out.println("");
		System.out.println("Default Value of float: "+dtd.f1);
		
		dtd.f1 = -Float.MIN_VALUE; 
		System.out.println("Lowest Range of Negetive float: "+dtd.f1);
		dtd.f2 = -Float.MAX_VALUE;
		System.out.println("Highest Range of Negetive float: "+dtd.f2);
		dtd.f3 = Float.MIN_VALUE;
		System.out.println("Lowest Range of Positive float: "+dtd.f3);
		dtd.f4 = Float.MAX_VALUE; 
		System.out.println("Highest Range of Positive float: "+dtd.f4);
		
		System.out.println("");
		System.out.println("Default Value of double: "+dtd.d1);
		
		dtd.d1 = -Double.MIN_VALUE;
		System.out.println("Lowest Range of Negetive double: "+dtd.d1);
		dtd.d2 = -Double.MAX_VALUE;
		System.out.println("Highest Range of Negetive double: "+dtd.d2);
		dtd.d3 = Double.MIN_VALUE;
		System.out.println("Lowest Range of Positive double: "+dtd.d3);
		dtd.d4 = Double.MAX_VALUE;
		System.out.println("Highest Range of Positive double: "+dtd.d4);
		
		System.out.println("");
		System.out.println("Default Value of byte: "+dtd.bt1);
		
		dtd.bt1 = Byte.MIN_VALUE;
		System.out.println("Lowest Range of byte: "+dtd.bt1);
		dtd.bt2 = Byte.MAX_VALUE;
		System.out.println("Highest Range of byte: "+dtd.bt2);
		//the next two lines will give error
		//dtd.bt1= -129;
		//dtd.bt2 = 128;
		
		System.out.println("");
		System.out.println("Default Value of short: "+dtd.s1);
		
		dtd.s1 = Short.MIN_VALUE;
		System.out.println("Lowest Range of short: "+dtd.s1);
		dtd.s2 = Short.MAX_VALUE;
		System.out.println("Highest Range of short: "+dtd.s2);
		//the next two lines will give error
		//dtd.s1= -32769;
		//dtd.s2 = 32768;
		
		System.out.println("");
		System.out.println("Default Value of int: "+dtd.i1);
				
		dtd.i1 = Integer.MIN_VALUE;
		System.out.println("Lowest Range of int: "+dtd.i1);
		dtd.i2 = Integer.MAX_VALUE;
		System.out.println("Highest Range of int: "+dtd.i2);
		//the next two lines will give error
		//dtd.s1= -2147483649;
		//dtd.s2 = 2147483648;
		
		System.out.println("");
		System.out.println("Default Value of long: "+dtd.l1);
		
		dtd.l1 = Long.MIN_VALUE;
		System.out.println("Lowest Range of long: "+dtd.l1);
		dtd.l2 = Long.MAX_VALUE;
		System.out.println("Highest Range of long: "+dtd.l2);
		//the next two lines will give error
		//dtd.s1= -9223372036854775809L;
		//dtd.s2 = 9223372036854775808L;
		
	}
}