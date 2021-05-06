package interfaces;

import java.lang.*;

import classes.*;

public interface IBookEx
{
	public void insertBook(Book b);
	public void deleteBook(String bookid);
	public Book SearchBook(String bookid);
	
}