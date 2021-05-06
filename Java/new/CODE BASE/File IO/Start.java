import java.lang.*;				   

public class Start
{
	public static void main(String []args)
	{
		FileReadWriteDemo file = new FileReadWriteDemo();
		
		file.writeInFile("kari 222 10.2.2040","History.txt");
		
		String S;
		 
		S=file.readFromFile("History.txt");
		System.out.println(S);
	}
}