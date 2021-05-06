package interfaces;

import java.lang.*;

import classes.*;

public interface IStudentEx
{
	public void insertStudent(Student s);
	public void deleteStudent(String libraryid);
	public void returnBook(Student st);
	
}