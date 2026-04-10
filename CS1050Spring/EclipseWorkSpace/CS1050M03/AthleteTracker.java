/**
 * 
 */
import java.util.Scanner;
/**
 *Add better commenting to programs
 */
public class AthleteTracker {
//
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSummary();
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;
		while(keepGoing == true) {
			double currentHeight = getPositiveDouble(input,"Height (inches):");
			double currentWeight = getPositiveDouble(input,"Weight (pounds):");
			double currentBMI;
			final double BMI_US_FACTOR = 703;
			currentBMI = calculateBMI(currentHeight, currentWeight, BMI_US_FACTOR);
			String catagory = getBMICategory(currentBMI);
			System.out.println("Current Athletes BMI: " + currentBMI + "\nCurrent Athletes Catagory: " + catagory);
			
			keepGoing = AskToContinue(input);
		}
		input.close();
	}	//main
	
	//calculate the BMI parameters height weight and us_factor 
	//numberWeight * US_FACTOR / (numberHeight * numberHeight)
	//returns result
	public static double calculateBMI(double numberHeight, double numberWeight, double US_FACTOR) 	{
		 
		double result;
	
		result = numberWeight * US_FACTOR / (numberHeight * numberHeight);
	
		//System.out.println(result);
		return result;
	}	//calulateBMI
	
	//request for a input for a given prompt param(scannerinput and prompt topic 
	//validates that given input is a number and is positive
	public static double getPositiveDouble(Scanner methodInput, String questionPrompt)	{
		double result = 0.0;
		boolean test = false;
		while (!test) {
		    System.out.println("Please enter a " + questionPrompt);

		    if (methodInput.hasNextDouble()) {
		        result = methodInput.nextDouble();
		        
		        if (result > 0) {
		            System.out.println("Entered " + questionPrompt + " is " + result);
		            test = true;
		        } else {
		            // when inputs a number but it's 0 or negative
		            System.out.println("Error: Value must be positive.");
		        }
		    } else {
		    	//when input is not a number
		        System.out.println("Error: Please enter a valid numeric value.");
		        methodInput.next(); // Clear the invalid string from the buffer
		    }
		}
		return result;
	}
	
	//gives a category to input BMI
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
	//asks to continue no validation here could be improved
	public static boolean AskToContinue(Scanner methodInput) {
		char letter;
		boolean test = false;
		boolean yesNo = false;
		while(test == false) {
			System.out.println("Would you like to continue (Y/N)");
			letter = methodInput.next().charAt(0);
			if(letter == 'y' || letter == 'Y') {
				System.out.println("Continuing.");
				yesNo = true;
				test = true;
			}
			else if(letter == 'n' || letter == 'N') {
				System.out.println("Stopping");
				yesNo = false;
				test = true;
			}
			else {
				System.out.println("Please enter a valid response (Y/N).");
			}
		}
		return yesNo;
	}
	public static void printSummary() {
		System.out.println ("Team and Athlete Analysis"
		+"\ntrainer enters athlete data until they indicate they are done entering data. The trainer will enter each athlete’s weight and height"
		+"\neach athlete entered, the BMI value and category will be displayed based on these BMI ranges."
		+"\n18.5: Underweight"
		+"\n18.5 to under 25: Normal"
		+"\n25 to under 30: Overweight"
		+"\n30 or greater: Obese.");
	}
}

