/**
 * 
 * @author diana tiburcio
 *Bank Account
 */
public class BankAccount 
{
	private String name;
	private int accNum;
	private double balance; 
	
	public BankAccount(String name1, int accNum1)
	{
		balance = 0;
		name = name1;
		accNum = accNum1;
	}
	public BankAccount(String name2, int accNum2, double balance2)
	{
		name = name2;
		accNum = accNum2;
		balance = balance2;
	}
	
	public void deposit(double dep)
	{
		balance += dep;
	}
	public void withdraw(double wit)
	{
		balance -= wit;
	}
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return "name: " + name + "acount number " + accNum + "balance: " + balance;
	}
}
