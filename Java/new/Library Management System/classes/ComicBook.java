package classes;
import java.lang.*;

public class ComicBook extends Book
{
	private String manga;
	
	public void setManga(String manga)
	{
		this.manga=manga;
	}
	public String getManga()
	{
		return manga;
	}
	public void showInfo()
	{
		System.out.println("Book Name: "+getBookName());
		System.out.println("Book Id: "+getBookId());
		System.out.println("Book Price: "+getPrice());
		System.out.println("Book Accessible Amount: "+getAccessibleAmount());
		System.out.println("Manga :"+getManga());
	}
}