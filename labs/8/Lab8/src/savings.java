
public class savings extends account {
	//create default account
	public savings(){
		balance = 0;
		id = 0;
	}
	
	//create account with specific variables
	public savings(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	//create withdraw mechanism and overdraft rejection
	public void withdraw(double amount){
		if (amount < getbalance()){
			setBalance(getbalance() - amount);
		}
		else System.out.println("cannot overdraw from savings account");
	}
	
	public String toString() {
		return ;
	}

}
