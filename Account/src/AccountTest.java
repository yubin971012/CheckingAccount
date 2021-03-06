import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {

	public static void main(String args[]){
		Account account1 = new checkingAccount(100,50.0,0.01,0.07);
		Account account2 = new SavingAccount(100,0.05);
		
		Scanner scan = new Scanner(System.in);
		
		try{
			Scanner scan1 = new Scanner(System.in);
			
			System.out.println("Enter deposit amount for Account1: ");
			double amount=scan1.nextDouble();
			account1.debit(amount);
			System.out.println("Account1 balance: $"+account1.getBalance());
			
			System.out.println("Enter deposit amount for Account2: ");
			amount=scan1.nextDouble();
			account2.debit(amount);
			System.out.println("Account1 balance: $"+account1.getBalance());
			
			scan.close();
		}catch(InputMismatchException e){
			System.out.println("예외발생: 숫자를 입력하세요\n" +  e.toString());
		}catch(Exception e){
			System.out.println("예외발생 "+e.toString());
		}finally{
			account1.passTime(2);
			System.out.println("2month later account1: "+account1.getBalance());
		}
	}
}

