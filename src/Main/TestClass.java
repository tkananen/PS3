package Main;
import java.util.Scanner;

public class TestClass {
	public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
	Account a  = new Account(1122, 20000);
	a.setAnnualInterestRate(4.5);
	a.deposit(3000);
	try 
	{
		System.out.println("\nAttempting to withdraw $2500...Please wait");
		a.withdraw(2500);
		System.out.println("Success!");
		
		
	}catch(InsufficientFundsException e)
	{System.out.println("Sorry, but you lack the sufficient funds, you are short$" + e.getAmount());
		e.printStackTrace();
	
	}
	System.out.println("Would you like to see your balance, monthly interest rate, and date of account creation?\n");
	System.out.println("If so, please type 0");
	double printReceipt = scan.nextDouble();
	if(printReceipt == 0){
	
		System.out.printf("Your balance is $%.2f\n", a.getBalance());
		
		System.out.printf("Your monthly interest rate is %.2f%%\n", a.getMonthlyInterestRate());
		System.out.println("This account was created on: " + a.getDateCreated());
	}
	else
	{ System.out.println("Thank you, have a good day :-)");
	}
	}
		
	}
	
	



