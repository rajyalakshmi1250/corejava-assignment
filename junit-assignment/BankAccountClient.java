package sample;

public class BankAccountClient {
	public static void main(String[] args) {
		//SavingBankAccount account = new SavingBankAccount(101, "John Doe", 45000, false);
		CurrentBankAccount account = new CurrentBankAccount(101, "John Doe", 45000, 20000);
		doTransaction(account, "withdraw", 50000);
		
	}
	
	public static void doTransaction(BankAccount account, String operation, double amount) {
		if(operation.equals("withdraw")) {
			account.withdraw(amount);
			account.displayBankAccountDetails();
		}
	}
	
	
}
