import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Book obj[] = new Book[5];
		
		Book b1 = new Book("0199535566","Harry Potter and Order of the Pheonix","J.K.Rowling",2003);
		Book b2 = new Book("0199535566","Harry Potter and Order of the Pheonix","J.K.Rowling",2003);
		Book b3 = new Book();
		Book b4 = new Book("0199535566","Harry Potter and Order of the Pheonix","J.K.Rowling",2003);
		Book b5 = new Book("0199535566","Harry Potter and Order of the Pheonix","J.K.Rowling",2003);
		
		obj[0] = b1;
		obj[1] = b2;
		obj[2] = b3;
		obj[3] = b4;
		obj[4] = b5;
		
		for(int i=0; i<obj.length; i++)
		{
			if(obj[i] !=null)
			{
				obj[i].showDetails();
				
			}
		}
	}
	
	
}