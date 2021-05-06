import java.lang.*;
import java.util.Random;

public class RandomDemo
{
	public static void main(String args[])
	{
		Random rd = new Random();
		
		for(int i=0; i<5; i++)
		{
			int x = rd.nextInt(6)+1;
			
			System.out.println(x);
		}
	}
}






