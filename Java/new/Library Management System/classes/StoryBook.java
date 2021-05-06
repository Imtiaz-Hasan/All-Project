package classes;
import java.lang.*;

public class StoryBook extends Book
{
	private String historyBook;
	
	public void setHistoryBook(String historyBook)
	{
		this.historyBook=historyBook;
	}
	public String getHistoryBook()
	{
		return historyBook;
	}
	
	public void showInfo()
	{
		System.out.println("Book  Name: "+getBookName());
		System.out.println("Book  Id: "+getBookId());
		System.out.println("Book  Price: "+getPrice());
		System.out.println("Book  Accessible Amount: "+getAccessibleAmount());
		System.out.println("HistoryBook : "+getHistoryBook());
	}
}