/**
 * 
 */
import java.util.Scanner;
/**
 * comment
 */
public class LoginM03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tries = 0;
		String username = "username";
		String password = "password";
		String inputUsername;
		String inputPassword;
		Scanner keyboardInput = new Scanner(System.in);
		boolean logedIn = false;
		while (tries < 3 && !logedIn)
		{
			System.out.print("Enter Username ");
			inputUsername = keyboardInput.next();
			if (username.equals(inputUsername)) {
				System.out.println("\nCorrect Username!");
				System.out.print("What is the password? ");
				inputPassword = keyboardInput.next();
				if (password.equals(inputPassword)) {
					System.out.println("\nCorrect Password");
					logedIn = true;
				}
				else {
					System.out.println("\nIncorrect Password");
					tries++;
				}
			}
			else {
				System.out.println("\nIncorrect Username");
				tries++;
			}
		}
		if (logedIn == true)
		{
			System.out.println("\nLogin successful");
		}
		else
		{
			System.out.println("Timeout.");
		}
	keyboardInput.close();
	
	}
	

}
