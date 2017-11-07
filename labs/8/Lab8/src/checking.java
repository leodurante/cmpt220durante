
public class checking extends account {
	//create data fields
	private double overdraftlimit;
	
	//default constructor 
	public checking(){
	//	overdraftlimit = 0; // JA
	//	id = 0;
	//	balance = 0;
	}
	
	//construct an account
	public checking(int id, double balance, double overdraftlimit) {
	//	this.id = id; //JA
	//	this.balance = balance;
		super(id, balance);
		this.overdraftlimit = overdraftlimit;
	}
	
	//set the overdraft limit
	public void setoverdraftlimit(double overdraftlimit){
		this.overdraftlimit = overdraftlimit;
	}
	
	//return the overdraftlimit
	public double getoverdraftlimit(){
		return overdraftlimit;
	}
	
	//decrease balance by amount but don't if it would break the limit
	public void withdraw(double amount){
		if (getbalance() - amount < overdraftlimit){
			setBalance(getbalance() - amount);
		}
		else System.out.println("amount exceeds overdraft limit");
	}
	public String toString() {
		return ""; // JA
	}

}
