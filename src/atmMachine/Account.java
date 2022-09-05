package atmMachine;

public class Account {
	
	private String username;
	private String password;
	private double balance;
	
	public Account(String username, String password, double balance) {
		this.username = username;
		this.password = password;
		this.balance = balance;
	}
	
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void depositMoney(double amount) {
		if (amount<=0) {
			System.out.println("Please enter valid amount.");
		}
		else {
			this.balance+=amount;
		}
	}
	
	public void withdrawMoney(double amount) {
		if (amount<=0) {
			System.out.println("Please enter valid amount.");
		}
		else if (amount>this.balance){
			System.out.println("Declined. Your balance: "+this.balance);
		}
		else {
			this.balance-=amount;
		}
	}
	
	
}

