import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account listOfAccounts[] = new Account [3] ;
		
		Account a1 = new Account(111, "OOP1 K", 2000);
		Account a2 = new Account(112, "OOP1 Q", 3000);
		Account a3 = new Account(113, "OOP1 B", 1000);
		
		listOfAccounts[0] = a1;
		listOfAccounts[1] = a2;
		listOfAccounts[2] = a3;
		
		for(int i=0; i<listOfAccounts.length; i++)
		{
			if(listOfAccounts[i] !=null)
			{
				System.out.println(listOfAccounts[i].getAccountNumber());
				System.out.println(listOfAccounts[i].getAccountHolderName());
				System.out.println(listOfAccounts[i].getBalance());
				System.out.println("--------------");
			}
		}
	}
}