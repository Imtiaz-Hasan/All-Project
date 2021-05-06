import java.lang.*;
import java.util.*;

public class RandomDemo
{
	public static void main(String args[])
	{
		Random rd = new Random();
		
		for(int i=0; i<5; i++)
		{
			//int n = rd.nextInt();
			int n = rd.nextInt(10)+11;
			System.out.println(n);
		}
	}
}
