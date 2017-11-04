import java.util.Date;

public class account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//default account
	account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	account(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	
	//mutator methods
	public void setId(int newId) {
		id = newId;
	}

	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	//accessor methods
	public int id(){
		return id;
	}
	
	public double getbalance(){
		return balance;
	}
	
	public double getannualInterestRate(){
		return annualInterestRate;
	}
	
	//monthly interest rate
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	//monthly interest
	public double getMonthlyInterest(){
		return getMonthlyInterestRate() * getbalance();
	}
	
	//withdraw, decrease by amount
	public void withdraw(double amount){
		balance -= amount;
	}
	
	//deposit, increase by amount
	public void deposit(double amount){
		balance += amount;
	}
	
	//date created
	public String getDateCreated(){
		return dateCreated.toString();
	}

}
