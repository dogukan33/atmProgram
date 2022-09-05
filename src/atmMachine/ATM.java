package atmMachine;

import java.util.Scanner;

public class ATM {
	
	public void run(Account acc) {
		
		final String menu = "1)See Balance\n2)Withdraw\n3)Deposit\n4)Press 'q' to exit.";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ATM Program by dogukan33");
		System.out.println("Login (1)\nRegister (2)\nExit()");
		String req1 = scanner.nextLine();
		if (req1.equals("1")) {
			Login login = new Login();
			int attempt = 3;
			while (true) {
				if (login.login(acc)) {
					System.out.println("Welcome! "+acc.getUsername());
					break;
				}
				else {
					System.out.println("Invalid username or password. Please try again.");
					attempt-=1;
					System.out.println(attempt+" login attempts remaining");
				}
				
				if (attempt==0) {
					System.out.println("You have been kicked from the system.");
					
					return;
				}
				
			}
			//comes here after the login loop
			System.out.println(menu);
			while (true) {
				System.out.println("Request: ");
				String req2 = scanner.nextLine(); 
				if (req2.equals("1")) {
					System.out.println("Your current balance: "+acc.getBalance()); 
				}
				else if (req2.equals("2")) {
					System.out.println("Enter the amount of money that you want to withdraw: ");
					double amount = scanner.nextDouble();
					acc.withdrawMoney(amount);
					continue; //check here again.
				}
				else if (req2.equals("3")) {
					System.out.println("Enter the amount of money that you want to deposit: ");
					double amount = scanner.nextDouble();
					acc.depositMoney(amount);
				}
				else if (req2.equals("q")) {
					System.out.println("Logged out succesfully.");
					break;
				}
				
			}
			
		}
		else if (req1.equals("2")) {
			System.out.println("Register system is currently inactive. Please try again later.");
			return;
		} else System.out.println("Invalid request number. Program is terminated.");
		
	}

}
