package Main;

import java.util.Date;
public class Account {
	private int id = 0;
	private double balance=0;
	private double annualInterestRate=0 ;
	private Date dateCreated;
	
	public Account(){
		this.dateCreated = new Date();
	}
	
	public Account(int id, double balance){
		this.balance = balance;
		this.id = id;
		
		
		
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated(){
		return dateCreated = new java.util.Date();
	}
	public double getMonthlyInterestRate(){
		double monthlyRate = (this.annualInterestRate) / 12;
		return monthlyRate;
		
	}
	public void withdraw(double withdrawAmount)throws InsufficientFundsException{
		double amountNeeded = 0;
		if (withdrawAmount <= balance){
			balance = (balance-withdrawAmount);					
		}
		else{
			 amountNeeded = withdrawAmount - balance;
			 throw new InsufficientFundsException(amountNeeded);
		}
		
	}
	public void deposit(double depositAmount)		
	{ balance = balance + depositAmount;
	}
	
}