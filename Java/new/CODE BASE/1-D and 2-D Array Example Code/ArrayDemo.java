import java.lang.*;

public class ArrayDemo
{
	public static void main(String []args)
	{
		//DataType ArrayName [] = new DataType [Size]
		// array is initialized with default value 0 for each element
		
		int A[] = new int [5];
		
		A[0] = 10;
		A[3] = 20;
		
		for(int i=0; i< A.length; i++)
		{
			System.out.println("A["+i+"] : "+ A[i]);	
		}
		
		//for (DataType variableName : Array){  }
		for(int value : A)
		{
			System.out.println(value);
		}
		
		
		
		int []B;
		int size = (A[3] / A[0]) + 2;
		B = new int [size];
		
		B[0] = 11;
		B[1] = 22;
		B[2] = 33;
		B[3] = 44;
		
		for(int value : B)
		{
			System.out.println(value);
		}
		
		
		int []C = new int []{1,2,3};
		
		for(int i=0; i<C.length; i++)
		{
			System.out.println("C["+i+"] : "+C[i]);
		}
		
		int D[] = {1,2,3,4};
		
		int index = 0;
		
		while(index<D.length)
		{
			System.out.println(D[index]);
			index++;
		}
		
		//############## 2D array ########//
		//dataType arrayName[][] = new dataType[row][col]
		int Arr2D[][] = new int[2][3];
		
		Arr2D[1][1] = 1;
		Arr2D[1][2] = 3;
		Arr2D[0][0] = 5;
		
		//for row
		for(int i=0;i<2;i++){
			//for col
			for(int j=0;j<3;j++){
			System.out.print(Arr2D[i][j]);
			}
			System.out.println();
		}
		
		/*
		using for each element
		Arr2D is a 2-D array and it consist of some 1-D array
		using for we get one 1-D array at a time and load it in value[]
		*/
		for(int value[] : Arr2D){
		/*
		from that 1-D array we using another for each 
		to get one value a time and load it in v variable.
		*/
			for(int v : value){
				System.out.print(v);
			}
			System.out.println();
		}
		
	}
}