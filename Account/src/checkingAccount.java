public class checkingAccount extends Account {

	public checkingAccount(double balance,double debit_limit,double interest, double loan_interest){
		super(balance);
		setBalance(balance);
		setInterest(interest);
		setDebit_limit(debit_limit);
		setLoan_interest(loan_interest);
	}

	private double debit_limit;
	public void setDebit_limit(double s){
		debit_limit=s;
	}
	private double interest;
	public void setInterest(double i){
		interest=i;
	}
	private double loan_interest;
	public void setLoan_interest(double li){
		loan_interest=li;
	}
	
	@Override
	public void debit(double amount) throws Exception{
		if(amount<0){
			throw new Exception("음수입력!");
		}else if(amount>debit_limit){
			throw new Exception("Debit amount exceed account balance.");
		}else{
		setBalance(getBalance()-amount);
		}
	}

	public void nextMonth(double b){
		if(getBalance()<0){
			setBalance(getBalance()-getBalance()*loan_interest);
		}else if(getBalance()>0){
			setBalance(getBalance()+getBalance()*interest);
		}
	}
	
	@Override
	public double getWithdrawableAccount(){
		return getBalance() + debit_limit;
	}

	@Override
	public void passTime(int month){
		if(getBalance()<0){
			setBalance(getBalance()+getBalance()*loan_interest);
		}else if(getBalance()>0){
			setBalance(getBalance()+getBalance()*month*interest);
		}
	}
	
	public boolean isBankrupted(){
		if(getWithdrawableAccount()<0) return false;
		else if(getWithdrawableAccount()>0);
		return true;
	
	}
}
