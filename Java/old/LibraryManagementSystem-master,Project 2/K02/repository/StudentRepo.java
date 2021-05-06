package repository;

import java.lang.*;
import java.util.ArrayList;

import entity.*;
import interfaces.*;


public class StudentRepo implements IStudentRepo
{
	
	DatabaseConnection dbc;
	
	public StudentRepo()
	{
		dbc = new DatabaseConnection();
	}
	
	public void insertStudent(Student s)
	{
		String query = "INSERT INTO student VALUES ('"+s.getstudentName()+"','"+s.getLibraryID()+"',"+s.getBookID()+");";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}	
	}
	public void deleteStudent(String libraryid)
	{
		String query = "DELETE from student WHERE libraryid='"+libraryid+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void issueBook(Student st)
	{
		String query = "UPDATE student SET studentname='"+st.getstudentName()+"', bookid='"+st.getBookID()+"' WHERE libraryid='"+st.getLibraryID()+"'";
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	public void returnBook(Student st)
	{
		String query = "UPDATE student SET studentname='"+st.getstudentName()+"', bookid='"+st.getBookID()+"' WHERE libraryid='"+st.getLibraryID()+"'";
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
	
	public Student searchStudent(String libraryid)
	{
		Student st = null; 
		String query = "SELECT `studentname`,`bookid` FROM `student` WHERE `libraryid`='"+libraryid+"';";
			
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
				
			while(dbc.result.next())
			{
				String studentname = dbc.result.getString("studentname");
				String bookid = dbc.result.getString("bookid");					
					
				st = new Student();
				st.setBookID(bookid);
				st.setstudentName(studentname);
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
			
		return st;
	}
	
	
	public String[][] getallstudent()
	{
		ArrayList<Student> ar = new ArrayList<Student>();
		String query = "SELECT * FROM student";
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
			
			while(dbc.result.next())
			{
				String studentname = dbc.result.getString("studentname");
				String libraryid = dbc.result.getString("libraryid");
				String bookid = dbc.result.getString("bookid");
				
				Student s = new Student(studentname,libraryid,bookid);
				ar.add(s);
			}
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][3];
		
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((Student)obj[i]).getstudentName();
			data[i][1] = ((Student)obj[i]).getLibraryID();
			data[i][2] = ((Student)obj[i]).getBookID();
		}
		return data;
	}
}