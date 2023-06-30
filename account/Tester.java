package account;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new SavingAccount(500,5);
		Account a2=new SavingAccount(700,6);
		Account a3=new CurrentAccount(600,3);
		Account a4=new CurrentAccount(5000,4);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		Bank b1=new Bank();
		b1.addAcc(a1);
		b1.addAcc(a4);
		b1.addAcc(a3);
		b1.addAcc(a2);
		a1.deposit(500);
		a2.deposit(6000);
		a3.deposit(400);
		a4.deposit(200);
		System.out.println();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		b1.remove(a2);
		System.out.println();
		b1.printAccs();
				

	}

}
