import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String validPassword = "java2020";
		int remainingTries = 3; 
		
		System.out.print("Please enter your password: ");
		String password = input.nextLine();
		
		// Loop until no remaining tries or a valid password has been entered
		while(remainingTries > 1 && !password.equals(validPassword)) {	
			
			// Begin the loop with decrees remainingTries, one attempt have been used at beginning of every loop
			remainingTries -= 1; 
			
			if(!password.equals(validPassword)) {				
				System.out.print("Invalid password! " + remainingTries + " attempt(s) left: ");
				password = input.nextLine();				
			}			
		}
		
		// If the value in password is not equal to validPassword the else message will be printed
		if(password.equals(validPassword)) {
			System.out.println("\n --------------------------------------------------------\n| "
					+ "You have successfully logged in! You can now continue. "
					+ "|\n --------------------------------------------------------");
		} else {			
			System.out.println("\n ------------------------------------------------\n| "
					+ "Too many failed attempts! You can NOT continue."
					+ "|\n ------------------------------------------------");
		}
		
		input.close();

	}
	
}

