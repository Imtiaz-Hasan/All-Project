package classes;
import java.lang.*;
import interfaces.*;

public abstract class Book implements IAmount

{
	 String bookname;
	 String bookid;
	 double price;
	 int accessibleAmount;
	
	
	public void setBookName(String bookname)
	{
		this.bookname = bookname;
	}
	public void setBookId(String bookid)
	{
		this.bookid = bookid;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setAccessibleAmount(int accessibleAmount)
	{
		this.accessibleAmount = accessibleAmount;
	}

	public String getBookName()
	{
		return bookname;
	}
	public String getBookId()
	{
		return bookid;
	}
	public double getPrice()
	{
		return price;
	}
	public int getAccessibleAmount()
	{
		return accessibleAmount;
	}
	
	public abstract void showInfo();
	
	public void addAmount(int amount)
	{
		if(amount>0)
		{
		   accessibleAmount+=amount;
		}
	}
	public void sellAmount(int amount)
	{
		if(amount>0 &&amount<=accessibleAmount)
		{
		   accessibleAmount-=amount;
		}
	}
	
}