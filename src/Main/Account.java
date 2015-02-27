package Main;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
	}
	
	public Account(int id, double balance){
		this.balance = balance;
		this.id = id;
		
		
		
	}
	//Accessor for Id
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
	public Date getdateCreated(Date dateCreated){
		return dateCreated;
	}
	public double getMonthlyInterestRate(double AnnualRate){
		double monthlyRate = annualInterestRate / 12;
		return monthlyRate;
		
	}
	
}
