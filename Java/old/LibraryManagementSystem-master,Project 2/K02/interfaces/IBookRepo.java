package interfaces;

import java.lang.*;

import entity.*;

public interface IBookRepo
{
	public void insertBook(Book b);
	public void deleteBook(String bookid);
	public Book SearchBook(String bookid);
	public String[][] getAllBook();
}