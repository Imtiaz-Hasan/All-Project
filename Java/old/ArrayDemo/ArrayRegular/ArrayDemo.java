import java.lang.*;

public class ArrayDemo
{
	public static void main(String args[])
	{
		
		int []A = new int [3];
		
		A[0] = 40;
		A[1] = 20;
		A[2] = 30;
			
		/*
		int []A;
		A = new int [3];
		A[0] = 40;
		A[1] = 50;
		A[2] = 30;
		*/
		
		/*
		int []A = new int []{1,2,3};
		*/
		
		/*
		int A[] = {1,2,3};
		*/
		
		for(int i=0; i<A.length; i++)
		{
			System.out.println(A[i]);
		}
	}
}