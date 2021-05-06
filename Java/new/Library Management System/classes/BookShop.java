package classes;
import java.lang.*;
import interfaces.*;

public class BookShop implements UserOperation,LibraryOperation
{
	Library libraries[]=new Library[50];
	User users[]=new User[10];
	
	public void insertUser(User u)
	{
		boolean flag=false;
		
		for(int i=0;i<users.length;i++)
		{
			if(users[i]==null)
			{
				users[i]=u;
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("User inserted.");
		}
		else
		{
			System.out.println("Users can not be inserted.");
		}
	}
	public void removeUser(User u)
	{
		boolean flag=false;
		
		for(int i=0;i<users.length;i++)
		{
			if(users[i]==u)
			{
				users[i]=null;
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("User removed.");
		}
		else
		{
			System.out.println("User can not be removed.");
		}
	}
	public User getUser(int empId)
	{
		User u=null;
		
		for(int i=0;i<users.length;i++)
		{
			if(users[i]!=null)
			{
				if(users[i].getUserId()==empId)
				{
					u=users[i];
					break;
				}
			}
		}
		return u;
	}
	public void showAllUsers()
	{
		for(User u : users)
		{
			if(u!= null)
			{
				System.out.println("User Name : "+u.getName());
				System.out.println("User ID : "+u.getUserId());
				
			}
		}
	}
	public void insertLibrary(Library s)
	{
		boolean flag=false;
		
		for(int i=0;i<libraries.length;i++)
		{
			if(libraries[i]==null)
			{
				libraries[i]=s;
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("Library inserted.");
		}
		else
		{
			System.out.println("Library can not be inserted.");
		}
	}
	public void removeLibrary(Library s)
	{
		boolean flag=false;
		
		for(int i=0;i<libraries.length;i++)
		{
			if(libraries[i]==s)
			{
				libraries[i]=null;
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("Library removed.");
		}
		else
		{
			System.out.println("Library can not be removed.");
		}
	}
	public Library getLibrary(String address)
	{
		Library ss=null;
		
		for(int i=0;i<libraries.length;i++)
		{
			if(libraries[i]!=null)
			{
				if(libraries[i].getAddress().equals(address))
				{
					ss=libraries[i];
					break;
				}
			}
		}
		return ss;
	}
	public void showAllLibraries()
	{
		for(Library s :libraries)
		{
			if(s!= null)
			{
				System.out.println("Library Name : "+s.getName());
				System.out.println("Library ID : "+s.getAddress());
				s.showAllBooks();
				
			}
		}
	}
}