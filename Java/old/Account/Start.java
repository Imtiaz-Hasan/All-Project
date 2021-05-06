import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account();
		
		a1.setAccountNumber(100001);
		a1.setAccountHolderName("OOP1 K");
		a1.setBalance(5000.0);
		
		System.out.println("Account Number: "+a1.getAccountNumber());
		System.out.println("Account HolderName: "+a1.getAccountHolderName());
		System.out.println("Balance: "+a1.getBalance());
	
		Account a2 = new Account(100002, "OOP1 Q", 2000.0);
		a2.showDetails();
		
	}
}