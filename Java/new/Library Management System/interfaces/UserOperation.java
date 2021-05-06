package interfaces;
import java.lang.*;
import classes.*;
public interface UserOperation
{
	void insertUser(User e);
	void removeUser(User e);
	User getUser(int userId);
	void showAllUsers();
	
}