public abstract class Account{
	private double balance;
	public Account(double balance) {
		setBalance = getBalance();
	}

	public double getBalance(){
		return balance;
	}
	public void debit(double b){
		balance -= b;
	}
	public void credit(double b){
		balance += b;
	}
	protected double setBalance;
	public double setBalance(double b){
		balance=b;
		return balance;
	}
	public void Account(double b){
		balance =b;
	}
	public abstract double getWithdrawableAccount();
	
	public abstract void passTime(int t);
}