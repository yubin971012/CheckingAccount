import java.util.Scanner;

public class AccountTest {
public static void main(String[]args){
	
	Scanner input=new Scanner(System.in);
	
	checkingAccount account1 = new checkingAccount();
	checkingAccount account2 = new checkingAccount();
	
	account1.setDebit_limit(1000);
	account2.setDebit_limit(1000);
	
	account1.setInterest(0.07);
	account2.setInterest(0.07);
	
	account1.setLoan_interest(0.08);
	account2.setLoan_interest(0.08);
	
	account1.setBalance(100.00);
	account2.setBalance(100.00);
	
	
	System.out.printf("Account1 balance:$ %f\n",account1.getBalance());
	System.out.printf("Account2 balance:$ %f\n",account2.getBalance());
	
	System.out.print("Enter deposit  amount for Account1:");
	double credit = input.nextDouble();
	
	account1.credit(credit);
	
	System.out.printf("Account1 balance:$ %f\n",account1.getBalance());
	System.out.printf("Account2 balance:$ %f\n",account2.getBalance());
	
	System.out.print("Enter deposit amount for Account2:");
	double debit = input.nextDouble();
	
	account2.debit(debit);
	
	System.out.printf("Account1 balance:$ %f\n",account1.getBalance());
	System.out.printf("Account2 balance:$ %f\n",account2.getBalance());
	
	System.out.print("next month!\n");
	
	account1.nextMonth(account1.getBalance());
	account2.nextMonth(account2.getBalance());
	
	System.out.printf("Account1 balance:$ %f\n",account1.getBalance());
	System.out.printf("Account2 balance:$ %f\n",account2.getBalance());
	}
}