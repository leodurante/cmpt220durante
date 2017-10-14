package lab6;

public class lab9_7 {

	public static void main(String[] args) {
		//create account class
		

	}
	//craete entire class account in accordance to question parameters
	class Account {
		//create a private in field called id set to zero
		private int id = 0;
		
		//create a private double data field called balance set to zero
	    private double balance = 0;
	    
	    //create a private double called annualInterestRate to store
	    //current interest rate set to zero
	    //assume it is constand for all accounts moving forward
	    private static double annualInterestRate = 0.0;
	    
	    //a private date called dateCreated
	    private java.util.Date dateCreated;

	    //"a no-arg constructor that creates a default account"
	    public Account() {
	        dateCreated = new java.util.Date();
	    }

	    //an account to hold specified values for 
	    public Account(int id, double balace) {
	        this();
	        this.id = id;
	        this.balance = balance;
	    }

	    public int getId() {
	        return this.id;
	    }

	    public double getBalance() {
	        return this.balance;
	    }

	    public double getAnnualInterestRate() {
	        return annualInterestRate;
	    }

	    public String getDateCreated() {
	        return this.dateCreated.toString();
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public void setAnnualInterestRate(double annualInterestRate) {
	        this.annualInterestRate = annualInterestRate;
	    }

	    public double getMonthlyInterestRate() {
	        return (annualInterestRate / 100) / 12 ;
	    }

	    public double getMonthlyInterest() {
	        return balance * getMonthlyInterestRate();
	    }

	    public void withdraw(double amount) {
	        this.balance -= amount;
	    }

	    public void deposit(double amount) {
	        this.balance += amount;
	    }
	}

}
