package entity;

import java.lang.*;

public class Librarian
{
	String empID;
	String name;
	String email;
	double salary;
	
	public Librarian(){}
	public Librarian(String empID, String name, String email, double salary)
	{
		this.empID = empID;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	public void setEmpId(String empID){this.empID = empID;}
	public void setName(String name){this.name = name;}
	public void setEmail(String email){this.email = email;}
	public void setSalary(double salary){this.salary = salary;}
}