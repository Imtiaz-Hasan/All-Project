package myException;

import java.lang.*;
import java.util.ArrayList;

import classes.*;
import interfaces.*;


public class StudentEx implements IStudentEx
{
	
	
	public void insertStudent()
	{
		System.out.println("Student Inserted");	
	}
	public void deleteStudent()
	{
		System.out.println("Student Deleted");
	}
	public void retuenBook()
	{
		System.out.println("returned");
	}
	
}