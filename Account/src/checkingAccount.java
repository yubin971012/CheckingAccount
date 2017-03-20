
public class checkingAccount extends Account {
	
	private void setBalance(){
		
	}
	
	private double credit_limit;
	public double getCredit_limit(){
		return credit_limit;
	}
	private double interest;
	public double getInterest(){
		return interest;
	}
	private double loan_interest;
	public double getLoan_interest(){
		if(balance>0){
			
		}
		setBalance();
	}
	
	
	@Override
	public void debit(double b){
		balance -=b;
		setBalanace();
	}
	
	public void nextMonth(double b){
		if(balance<0){
			
		}
	}
}
