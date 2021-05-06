package repository;

import java.lang.*;
import java.util.ArrayList;

import entity.*;
import interfaces.*;


public class BookRepo implements IBookRepo
{
	DatabaseConnection dbc;
	
	public BookRepo()
	{
		dbc = new DatabaseConnection();
	}
	
	public void insertBook(Book b)
	{
		String query = "INSERT INTO book VALUES ('"+b.getBookID()+"','"+b.getBookName()+"','"+b.getAuthorname()+"','"+b.getEdition()+"');";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void deleteBook(String bookid)
	{
		String query = "DELETE from book WHERE bookid='"+bookid+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	

	public Book SearchBook(String bookid)
	{
		Book bk = null;
		String query = "SELECT `bookname`, `authorname`, `edition` FROM `book` WHERE `bookid`='"+bookid+"';";
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
			
			while(dbc.result.next())
			{
				String bookname = dbc.result.getString("bookname");
				String authorname = dbc.result.getString("authorname");
				String edition = dbc.result.getString("edition");
				
				bk = new Book();
				bk.setBookName(bookname);
				bk.setAuthorName(authorname);
				bk.setEdition(edition);
			}
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		
		return bk; 
	}
	
	
	
	public String[][] getAllBook()
	{
		ArrayList<Book> ar = new ArrayList<Book>();
		String query = "SELECT * FROM book;";
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
			
			while(dbc.result.next())
			{
				String bookid = dbc.result.getString("bookid");
				String bookname = dbc.result.getString("bookname");
				String authorname = dbc.result.getString("authorname");
				String edition = dbc.result.getString("edition");
			
				Book b = new Book(bookid,bookname,authorname,edition);
				ar.add(b);
			}
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][4];
			
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((Book)obj[i]).getBookID();
			data[i][1] = ((Book)obj[i]).getBookName();
			data[i][2] = ((Book)obj[i]).getAuthorname();
			data[i][3] = ((Book)obj[i]).getEdition();
		}
		return data;
	}
}