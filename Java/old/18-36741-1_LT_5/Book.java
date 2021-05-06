import java.lang.*;

public class Book
{
	private String bookId;
	private String bookTitle;
	private String authorName;
	private int publicationYear;
	
	public Book()
	{
		System.out.println("Empty Book");
	}
	
	public Book(String bookId, String bookTitle, String authorName, int publicationYear) 
	{
		System.out.println("Para Book");
		this.bookId=bookId;
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.publicationYear=publicationYear;
	}
	public void showDetails()
	{
		System.out.println("Book ID: "+this.bookId);
		System.out.println("Book Title: "+this.bookTitle);
		System.out.println("Author Name: "+this.authorName);
		System.out.println("Publication Year: "+this.publicationYear);
	}
}