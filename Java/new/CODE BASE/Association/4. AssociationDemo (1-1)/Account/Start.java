import java.lang.*;

public class Start
{
	public static void main(String []args)
	{

	
	System.out.println("----------------------------------------");
	Account a2 = new Account(22222222, "OOP1 C", 2500.0);
	Customer c2 = new Customer("+88019876543221", a2);
	
	System.out.println("Customer PhnNumber: "+c2.getPhnNumber());
	System.out.println("Customer Account Number: "+ (c2.getAccount()).getAccountNumber());
	System.out.println("Customer Account Holder Name: "+c2.getAccount().getAccountHolderName());
	System.out.println("Customer Balance: "+c2.getAccount().getBalance());
	
		
	}
}




