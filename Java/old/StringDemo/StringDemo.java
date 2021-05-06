public class StringDemo
{
	public static void main(String argsp[])
	{
		String s1 = "Java";
		String s2 = "";
		String s3 = new String("Java");
		String s4 = "Java";
		
		System.out.println(s2.isEmpty());	//true
		
		System.out.println(s1.isEmpty());	//false
		
		System.out.println(s1.length());	//4
		
		s2 = "Hello World";
		
		System.out.println(s2.charAt(4)); 	//o
		
		System.out.println(s1==s3);			//false
		System.out.println(s1==s4);			//true
		
		System.out.println(s1.equals(s3));	//true
		System.out.println(s1.equals(s4));	//true
		
		System.out.println(s1.concat(s2));	//JavaHello World
		
		System.out.println(s1);				//Java
		System.out.println(s2);				//Hello World
		
		String s5= s1.concat(s2);
		
		System.out.println(s1);				//Java
		System.out.println(s2);				//Hello World
		System.out.println(s5);				//JavaHello World
	}
}