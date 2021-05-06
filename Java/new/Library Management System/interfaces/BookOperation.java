package interfaces;
import java.lang.*;
import classes.*;
public interface BookOperation
{
	void insertBook(Book b);
	void removeBook(Book b);
	Book getBook(String bookId);
	void showAllBooks();
	
}