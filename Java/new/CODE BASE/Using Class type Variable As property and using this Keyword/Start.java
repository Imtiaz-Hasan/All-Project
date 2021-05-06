import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Data d = new Date();
		d.setDate(27,7,2020);
		Account a1 = new Account(22222222, "OOP1 C", 3500.0,d);
		a1.showDetails();
		
	}
}