public class SavingAccount extends Account {

	private double interest;
	private int month;
	public SavingAccount(double balance,double interest){
		super(balance);
		setBalance(balance);
		setInterest(interest);
	}
	
	public void setInterest(double i){
		interest=i;
	}

	@Override
	public double getWithdrawableAccount(){
		return 0;
	}
	
	@Override
	public void passTime(int m){
		Math.pow(interest,12);
		if(month<12){
			setBalance = getBalance();
		}else if(month == 12){
			setBalance(getBalance()+getBalance()*Math.pow(interest, 12));
		}else if(month>13){
			setBalance = getBalance();
		}
	}
	@Override
	public void debit(double b){
		if(month<12){
			System.out.println("아직출금할수없습니다\n");
		}else{
			setBalance(getBalance()-b);
		}
	}
	
}
