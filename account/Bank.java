package account;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public List<Account> accounts=new ArrayList<>();
	public void addAcc(Account a)
	{
	  accounts.add(a);
	}
	
	public void remove(Account a)
	{
		accounts.remove(a);
	}
	public void printAccs()
	{
		for(Account a1:accounts)
		{
			System.out.println(a1);
			
		}
	}
	
	

}
