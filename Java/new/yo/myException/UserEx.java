package myException;

import java.lang.*;

import classes.*;
import interfaces.*;


public class UserEx implements IUserEx
{
	public User getUser(String userid, String pass)
	{
		Scanner sc = new Scanner(System.in);
		UserEx ed = new UserEx();
		
		try
		{
			System.out.print("Please Enter an userid: ");
			ed.userid = sc.next();
			System.out.print("Please Enter an pass: ");
			ed.pass = sc.next();
		}
		catch(InputMismatchException ime)
		{
			System.out.println("InputMismatchException occured");
		}
	}
	
}