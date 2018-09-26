/**
 * 
 * @author diana tiburcio
 *Bank Account
 */
public class BankAccountMain 
{
	public static void main(String[] args)
	{
		BankAccount dianaAccount = new BankAccount("diana",200672, 563.87);
		System.out.println("the current balance of Diana's Account is " + dianaAccount.getBalance());
		dianaAccount.deposit(133.86);
		dianaAccount.withdraw(12.65);
		dianaAccount.withdraw(23.85);
		System.out.println("the current balance of Diana's Account is " + dianaAccount.getBalance());
		BankAccount foodAccount = new BankAccount("food",200682);
		System.out.println("the current balance of Food Account is " + foodAccount.getBalance());
		foodAccount.deposit(50);
		foodAccount.withdraw(4.65);
		foodAccount.withdraw(1.25);
		System.out.println("the current balance of Food Account is " + foodAccount.getBalance());
	}
	
}
