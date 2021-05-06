package classes;

import java.lang.*;

public class Book
{
	String bookname;
	String bookid;
	String authorname;
	String edition;
	
	public Book(){}
	public Book(String bookid, String bookname, String authorname, String edition)
	{
		this.bookname = bookname;
		this.bookid = bookid;
		this.authorname = authorname;
		this.edition = edition;
	}
	
	public void setBookName(String bookname)
	{
		this.bookname = bookname;
	}
	public void setBookId(String bookid)
	{
		this.bookid = bookid;
	}
	public void setAuthorName(String authorname)
	{
		this.authorname = authorname;
	}
	public void setEdition(String edition)
	{
		this.edition = edition;
	}

	public String getBookName()
	{
		return bookname;
	}
	public String getBookID()
	{
		return bookid;
	}
	public String getAuthorname()
	{
		return authorname;
	}
	public String getEdition()
	{
		return edition;
	}
}