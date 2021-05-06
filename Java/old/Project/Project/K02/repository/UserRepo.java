package repository;

import java.lang.*;

import entity.*;
import interfaces.*;


public class UserRepo implements IUserRepo
{
	DatabaseConnection dbc;
	
	public UserRepo()
	{
		dbc = new DatabaseConnection();
	}
	public User getUser(String userid, String pass)
	{
		User user = null;
		String query = "SELECT userid, password FROM login WHERE userid='"+userid+"' AND password='"+pass+"';";
		try
		{
			System.out.println(query);
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				user = new User();
				user.setUserId(dbc.result.getString("userid"));
				user.setPassword(dbc.result.getString("password"));
			}
		}
        catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return user;
	}
	public void updateUser(User u)
	{
		
		String query = "UPDATE login SET password='"+u.getPassword()+"' WHERE userid='"+u.getUserId()+"'";
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}
}