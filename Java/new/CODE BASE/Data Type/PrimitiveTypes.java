public class PrimitiveTypes
{
  int i;
  public static void main (String[] args)
  {	
    PrimitiveTypes dt = new PrimitiveTypes();
	
	//info about integer datatype
	System.out.println("default value of int : " + dt.i);
	dt.i = Integer.MIN_VALUE;
	System.out.println("minimum value of int : "+dt.i);
	dt.i =Integer.MAX_VALUE;
	System.out.println("maximum value of int : "+dt.i);
	System.out.println("Size in bytes for int: " + (Integer.SIZE/8));
	
	// Type casting
	System.out.println();
	byte b1;
	short s1=130;
	System.out.println("Before Type casting: "+s1);
	b1 = (byte)s1;
	System.out.println("After Explicit Type casting short -> byte: "+b1);
	s1=b1;
	
	System.out.println("After implicit Type casting byte->short: "+s1);
	
	//Parsing using Wrapper class
	System.out.println();
	System.out.print("Integer Parsing : ");
	System.out.println(Integer.parseInt("45")/9);
  }
  
}