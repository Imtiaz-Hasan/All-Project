package classes;
import java.lang.*;

public class User
{
	private String name;
	private int userId;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setUserId(int userId)
	{
		this.userId=userId;
	}
	
	public String getName(){return name;}
	public int getUserId(){return userId;}
		
	
}
