package classes;
import java.lang.*;
import interfaces.*;

public class Library implements BookOperation
{
	protected String address;
	protected String name;
	Book books[]=new Book[10];
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getAddress(){return address;}
	public String getName(){return name;}
	
	public void insertBook(Book b)
	{
		boolean flag=false;
		
		for(int i=0;i<books.length;i++)
		{
			if(books[i]==null)
			{
				books[i]=b;
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("Books inserted.");
		}
		else
		{
			System.out.println("Books can not be inserted.");
		}
	}
	public void removeBook(Book b)
	{
		boolean flag=false;
		
		for(int i=0;i<books.length;i++)
		{
			if(books[i]==b)
			{
				books[i]=null;
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("Book removed.");
		}
		else
		{
			System.out.println("Book can not be removed.");
		}
	}
	public Book getBook(String bookid)
	{
		Book b=null;
		
		for(int i=0;i<books.length;i++)
		{
			if(books[i]!=null)
			{
				if(books[i].getBookId()==bookid)
				{
					b=books[i];
					break;
				}
			}
		}
		return b;
	}
	public void showAllBooks()
	{
		for(Book b : books)
		{
			if(b!= null)
			{
				b.showInfo();
			}
		}
	}
} 