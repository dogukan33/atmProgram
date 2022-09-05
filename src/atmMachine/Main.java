package atmMachine;

public class Main {
	public static void main(String args[]) {
		
		ATM atm = new ATM();
		
		Account account01 = new Account("dogukan33","1010",4300.0);
		
		atm.run(account01);
		
		System.out.println("Program is terminated.");
		
		
	}

}
