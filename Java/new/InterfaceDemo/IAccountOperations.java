import java.lang.*;
interface IAccountSearch
{
	Account getAccountByAccountNumber(int accountNumber);
	Account getAccountByAccountHolderName(int accountNumber);
	Account getAccountByAccountByBalance(int accountNumber);
	Account getAccountByAccountByOpeningDate(int accountNumber);
}

public interface IAccountOperations
{
	public abstract void addAccount(Account a);
	void removeAccount(Account a);
	void showAllAccounts();
}
