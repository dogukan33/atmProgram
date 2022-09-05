package atmMachine;
import java.util.Scanner;

public class Login {
	public boolean login(Account acc){
		
		Scanner scanner = new Scanner(System.in);
		String username;
		String password;
		
		System.out.println("Username: ");
		username = scanner.nextLine();
		System.out.println("Password: ");
		password = scanner.nextLine();
		
		if (acc.getUsername().equals(username) && acc.getPassword().equals(password)) {
			return true;
		}
		else return false;
	}
	
}
