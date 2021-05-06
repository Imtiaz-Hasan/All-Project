import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Customer c = new Customer("+988877655544",10);
		
		Account a1 = new Account();
		a1.setAccountHolderName("ASD");
		a1.setAccountNumber(1111);
		a1.setBalance(20000.0);
		
		SavingsAccount sa1 = new SavingsAccount();
		sa1.setAccountHolderName("QWE");
		sa1.setAccountNumber(1112);
		sa1.setBalance(21000.0);
		sa1.setInterestRate(10.5);
		
		FixedAccount fa1 = new FixedAccount();
		fa1.setAccountHolderName("MNO");
		fa1.setAccountNumber(1113);
		fa1.setBalance(22000.0);
		fa1.setTenureYear(10);
		
		c.addAccount(a1);
		c.addAccount(sa1);
		c.addAccount(fa1);

		c.showAllAccounts();
		
		if(c.getAccbyAccNo(1113) != null){
			System.out.println("FOUND");
			System.out.println(((FixedAccount)c.getAccbyAccNo(1113)).getTenureYear());
		}
		
	}
}