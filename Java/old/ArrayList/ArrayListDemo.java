import java.lang.*;
import java.util.ArrayList;

public class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		ArrayList<Account> accountList = new ArrayList<Account>();
		
		System.out.println(list.isEmpty());
		System.out.println(list);
		
		list.add(12);
		list.add(1.23455);
		
		System.out.println(list.isEmpty());
		System.out.println(list);
		
		list.add("Java");
		list.add('o');
		list.add(1.23455);
		
		System.out.println(list);
		
		System.out.println(list.indexOf(1.23455));
		System.out.println(list.lastIndexOf(1.23455));
		
		list.remove(1.23455);
		System.out.println(list);
		
		int i = list.indexOf(12);
		list.remove(i);
		System.out.println(list);
		
		Account a1 = new Account(1111,"OOP1",2000);
		list.add(a1);
		System.out.println(list);
		
		System.out.println("---------------");
		((Account)list.get(3)).showDetails();
		
		
		list.clear();
		System.out.println(list);
		
		Account a2 = new Account(1112,"OOP2",3000);
		Account a3 = new Account(1113,"OOP3",4000);
		
		accountList.add(a1);
		accountList.add(a2);
		accountList.add(a3);
		
		System.out.println(accountList);
		
		
		for(Account a : accountList)
		{
			a.showDetails();
			System.out.println("-------------------");
		}
		
	}
}