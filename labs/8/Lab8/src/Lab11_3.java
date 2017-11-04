
public class Lab11_3 {

	public static void main(String[] args) {
		//create account according to ex. 9.7 parameters
		account account = new account(1122, 20000, .045);
		checking checking = new checking(1004, 20000, -10);
		savings savings = new savings(1122, 20000);
		account.setAnnualInterestRate(.045);
		savings.setAnnualInterestRate(.045);
		checking.setAnnualInterestRate(.045);

		//withdraw from all accounts
		account.withdraw(2500);
		savings.withdraw(2500);
		checking.withdraw(2500);

		//deposit 3000 into all accounts
		account.deposit(3000);
		savings.deposit(3000);
		checking.deposit(3000);

		//display results from strings w/ toString
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}