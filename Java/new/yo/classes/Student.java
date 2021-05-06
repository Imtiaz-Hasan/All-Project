package classes;

import java.lang.*;

public class Student
{
	String studentname;
	String libraryid;
	String bookid;
	
	public Student(){}
	public Student(String studentname, String libraryid, String bookid)
	{
		this.studentname = studentname;
		this.libraryid = libraryid;
		this.bookid = bookid;
	}
	public void setstudentName(String studentname)
	{
		this.studentname = studentname;
	}
	public void setLibraryID(String libraryid)
	{
		this.libraryid = libraryid;
	}
	public void setBookID(String bookid)
	{
		this.bookid = bookid;
	}
	
	public String getstudentName()
	{
		return studentname;
	}
	public String getLibraryID()
	{
		return libraryid;
	}
	public String getBookID()
	{
		return bookid;
	}
}