package myException;

import java.lang.*;
import java.util.ArrayList;

import classes.*;
import interfaces.*;


public class BookEx implements IBookEx
{
	
	public void insertBook()
	{	
		System.out.println("Book Inserted");
	}
	public void deleteBook()
	{
		System.out.println("Book Deleted");
	}
	

	public Book SearchBook()
	{
		System.out.println("Book Searched");
	}
	
	
	
}