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
	final double BMI_US_FACTOR = 703;
		
	double BMI = calculateBMI(120.0,140.0,BMI_US_FACTOR);
	System.out.println(BMI);
	
	
	
	}	//main
	
	
	public static double calculateBMI(double numberH, double numberW, double US_FACTOR) 	{
		 
		double result;
	
		result = numberH * US_FACTOR / (numberH * numberH);
		return result;
	}	//calulateBMI
	
	public static double getPositiveDouble(Scanner methodInput, String questionPrompt)	{
		double result = 0.0;
		boolean test = false;
		while(test = false) {
			System.out.println("Please enter a " + questionPrompt);
			result = methodInput.nextDouble();
			if (result < 0) {
				System.out.println("Entered height is " + result);
			
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
		System.out.println("Ath")
	}
	
}
