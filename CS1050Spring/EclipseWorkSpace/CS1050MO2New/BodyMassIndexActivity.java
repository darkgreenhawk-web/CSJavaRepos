/**
 * Calculate the BMI using formula in US units. 
 * User will enter weight in pounds and height in inches
 */
// ADD CODE to import Scanner class
import java.util.Scanner;


public class BodyMassIndexActivity
{

	public static void main(String[] args)
	{
		//Create constants an variables
		// constants
		// factor formula in pounds
		final int BMI_US_FACTOR = 703;
		// Variables
		// The user's weight
		double userWeight;
		// The user's height
		double userHeight;
		// The user's BMI
		double userBMI;
		
		String catagory;
		
		// Create a Scanner object for scanning input from keyboard
		Scanner keyboardInput = new Scanner(System.in);
		// Tell the user what the program will do.
		System.out.println("This program will calculate your body mass index, or BMI.");

		// Get the user's weight.
		System.out.print("Enter your weight, in pounds: ");
		// ADD CODE to input next double for weight
		userWeight = keyboardInput.nextDouble();
		// Get the user's height.
		System.out.print("Enter your height, in inches: ");
		// input next double for height
		userHeight = keyboardInput.nextDouble();
		// Calculate the user's body mass index.
		userBMI = userWeight * BMI_US_FACTOR / (userHeight * userHeight);

		// Display the user's BMI.
		System.out.println("Weight " + userWeight + "\tHeight " + userHeight);
		System.out.printf("Your body mass index (BMI) is %f", userBMI);
		if (userBMI >= 30.0)
		{
			catagory = "Obese";
		}
		else if (userBMI >= 25)
		{
			catagory = "OverWeight";
		}
		else if (userBMI >= 18.5)
		{
			catagory = "Normal";
		}
		else
		{
			catagory = "Underweight";
		}
		System.out.println("\nYour catagory is: " + catagory);
		keyboardInput.close();
	}
}

