package interfaces;

import java.lang.*;
import entity.*;

public interface IUserRepo
{
	User getUser(String userid, String password);
	void updateUser(User u);
}