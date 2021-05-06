package interfaces;

import java.lang.*;

import entity.*;

public interface IStudentRepo
{
	public void insertStudent(Student s);
	public void deleteStudent(String libraryid);
	public void issueBook(Student st);
	public void returnBook(Student st);
	public Student searchStudent(String libraryid);
	public String[][] getallstudent();
}