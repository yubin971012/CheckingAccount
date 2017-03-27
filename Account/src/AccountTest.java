import java.util.Scanner;

public class AccountTest {
public static void main(String[]args){
	Account account1 = new checkingAccount(100,50,0.01,0.07);
	
	Scanner scan = new Scanner(System.in);
	double amount;
	
	System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.2f \n",account1.getBalance(),account1.getWithdrawableAccount());
	}
}