import java.lang.*;

public class ComLineIn
{
	private int a;
	private double b;
	private String c;
	public static void main(String args[])
	{
		for(int i =0; i<args.length; i++)
		{
			System.out.println("Value of args["+i+"] is : "+args[i]);
		}
		
		ComLineIn cli = new ComLineIn();
		
		cli.a = Integer.parseInt(args[0]);
		cli.b = Double.parseDouble(args[1]);
		cli.c = args[2];
		
		System.out.println(cli.a);
		System.out.println(cli.b);
		System.out.println(cli.c);
		
		System.out.println(args[0] + args[1]);
		System.out.println(cli.a + cli.b);
		
	}
}