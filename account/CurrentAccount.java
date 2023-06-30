package account;

public class CurrentAccount implements Account{
	private int balance;
	private int interest;
	
	public CurrentAccount(int balance, int interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}
	@Override
	public void deposit(int amt) {
		// TODO Auto-generated method stub
		balance=balance+amt;
		
	}
	@Override
	public void withdraw(int amt) {
		// TODO Auto-generated method stub
		balance=balance-amt;
		
	}
	@Override
	public void calcint() {
		// TODO Auto-generated method stub
		balance=balance*(interest/100);
		
	}
	@Override
	public int balance() {
		// TODO Auto-generated method stub
		return balance;
		
	}
	@Override
	public String toString() {
		return "CurrentAccount [balance=" + balance + ", interest=" + interest + "]";
	}
	

}
