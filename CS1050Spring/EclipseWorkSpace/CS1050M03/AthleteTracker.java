/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class AthleteTracker {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean continue = true;
		while(continue == true) {
			double currentHeight = getPositiveDouble(input,"Height");
			double currentWeight = getPositiveDouble(input,"Weight");
			double currentBMI;
			final double BMI_US_FACTOR = 703;
			currentBMI = calculateBMI(currentHeight, currentWeight, BMI_US_FACTOR);
			String catagory = getBMICategory(currentBMI);
			System.out.println(currentBMI);
			System.out.println(catagory);
	
		}
		input.close();
	}	//main
	
	
	public static double calculateBMI(double numberH, double numberW, double US_FACTOR) 	{
		 
		double result;
	
		result = numberH * US_FACTOR / (numberH * numberH);
		return result;
	}	//calulateBMI
	
	public static double getPositiveDouble(Scanner methodInput, String questionPrompt)	{
		double result = 0.0;
		boolean test = false;
		while(test == false) {
			System.out.println("Please enter a " + questionPrompt);
			result = methodInput.nextDouble();
			if (result > 0) {
				System.out.println("Entered height is " + result);
				test = true;
			}
			else {
				System.out.println("Invalid " + questionPrompt + ". Must be a positive number.");
			}
		}
		return result;
	}
	public static String getBMICategory (double currentBMI) {
		String catagory;
		if (currentBMI >= 30.0)
		{
			catagory = "Obese";
		}
		else if (currentBMI >= 25)
		{
			catagory = "OverWeight";
		}
		else if (currentBMI >= 18.5)
		{
			catagory = "Normal";
		}
		else
		{
			catagory = "Underweight";
		}
		System.out.println("\nYour catagory is: " + catagory);
		return catagory;
	}
	public static void printSummary() {
		System.out.println("Current Athlete's height is ");
	}
	public static boolean AskToContinue(Scanner methodInput) {
		char letter;
		boolean test = false;
		boolean yesNo = false;
		while(test == false)
			System.out.println("Would you like to continue (Y/N)");
			letter = methodInput.next().charAt(0);
			if(letter == 'y' || letter == 'Y') {
				System.out.println("Continuing.");
				yesNo = true;
			}
			else if(letter == 'n' || letter == 'N') {
				System.out.println("Stopping");
				yesNo = false;
			}
			else {
				System.out.println("Please enter a valid response (Y/N).");
			}
		return yesNo;
	}
}
