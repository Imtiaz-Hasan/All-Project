import java.lang.*;
import java.util.Scanner;

public class Start
{
	void test() throws MyException{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if(s.length() > 5)
			{
				System.out.println("Invalid String");
				throw new MyException();
			}
			else
			{
				System.out.println("Valid String");
			}

		
	}
	
	public static void main(String args[])
	{
		System.out.println("Start");
		
		Start st = new Start();
		
		try{
		st.test();
		}
		catch(MyException me){
			
		}
		System.out.println("End");
	}
}