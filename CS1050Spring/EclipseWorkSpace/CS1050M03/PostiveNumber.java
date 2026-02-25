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
		int exponent;
		double base;
		System.out.println("Enter a postitive number for an exponent:");
		exponent = keyboardInput.nextInt();
		while (exponent <= 0)
		{
			System.out.print("Invalid number! Please enter a vailid number:");
			exponent = keyboardInput.nextInt();
		}
		System.out.println("Your exponent is " + exponent);
		
		
		System.out.print("Enter a number as a base:");
		base = keyboardInput.nextDouble();
		for (int i = 1; i < exponent; i++)
		{
			base *= base;
		}
		System.out.println("Results of base: " + base);
			
		keyboardInput.close();
	}

}
