import java.util.Scanner;

public class Account{
	private double balance;
	public double getBalance(){
		return balance;
	}
	public void debit(double b){
		balance -= b;
		if(balance<0){
			System.out.print("Debit amount exceeded account balance.\n");
			balance += b;
		}
	}
	public void credit(double b){
		balance += b;
	}
	public void Account(double b){
		balance =b;
	}
	protected double setBalance;
	public double setBalance(double b){
		balance=b;
		return balance;
	}
}