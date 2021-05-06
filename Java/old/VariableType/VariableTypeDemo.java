import java.lang.*;

public class VariableTypeDemo
{
	private int a;
	private static int b;
	
	public static void main(String args[])
	{
		VariableTypeDemo obj1 = new VariableTypeDemo();
		VariableTypeDemo obj2 = new VariableTypeDemo();
		
		obj1.a = 10;
		obj2.a = 20;
		
		VariableTypeDemo.b = 100;
		
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(VariableTypeDemo.b);
		
		
		obj1.b = 200;
		System.out.println("---------");
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		obj2.a = 30;
		System.out.println("---------");
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		
		VariableTypeDemo obj3 = obj1;
		
		obj3.a = 40;
		obj3.b = 300;
		System.out.println("---------");
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj3.a);
		
		
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		System.out.println(obj3.b);
		
		System.out.println(VariableTypeDemo.b);
	}
}