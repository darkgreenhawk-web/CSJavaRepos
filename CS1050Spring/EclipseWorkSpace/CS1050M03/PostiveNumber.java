/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class PostiveNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		int number;
		System.out.println("Enter a postitive number.");
		number = keyboardInput.nextInt();
		while (number <= 0)
		{
			System.out.print("Invalid number! Please enter a vailid number:");
			number = keyboardInput.nextInt();
		}
		System.out.println("Your number is " + number);
	}

}
