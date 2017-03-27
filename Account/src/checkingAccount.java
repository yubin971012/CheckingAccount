
public class checkingAccount extends Account {
	
	private double debit_limit;
	public void setDebit_limit(double d){
		debit_limit=d;
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
	public void debit(double b){
		setBalance(getBalance()-b);
	}

	public void nextMonth(double b){
		if(getBalance()<0){
			setBalance(getBalance()-getBalance()*loan_interest);
		}else if(getBalance()>0){
			setBalance(getBalance()+getBalance()*interest);
		}
	}
}
