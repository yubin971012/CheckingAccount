import java.util.Scanner;

public class Account{
	private double balance;
	public double getBalance(){
		return balance;
	}
	public void debit(double b){
		balance -= b;
	}
	public void credit(double b){
		balance += b;
	}
	public void Account(double b){
		balance =b;
	}
}