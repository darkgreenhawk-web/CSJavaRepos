/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class FirstIterofProjectAthleteTracker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare arrays with data for now
		String[] names = {"Fred", "Bob", "Andrew", "Taylor", "Lily"};
		double[] bmis = {18.5, 25.0, 30.2, 28.0, 23.0};
		double[] mhrs = {200.0, 185.0, 190.0, 160.0, 175.0};
		
		Scanner input = new Scanner(System.in);
		//temp arrays while testing
		double[] height = {73.0, 56.0, 74.0, 60.0, 80.0};
		double[] weight = {180.5, 200.7, 215.5, };
		
// make better comments
//new change made made a new change
	}

	
	
	public static double calculateBMI(double numberHeight, double numberWeight, double US_FACTOR) 	{
		 
		double result;
	
		result = numberWeight * US_FACTOR / (numberHeight * numberHeight);
	
		//System.out.println(result);
		return result;
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
	
	/**
	 * 
	 * @param names
	 * @param doubleArray
	 * @param avg
	 */
	public static void displayAboveAverage(String[] names, double[] doubleArray, double avg) {
		System.out.println("Students who scored above average:");
		for (int i = 0; i < doubleArray.length; i++) {
			if (doubleArray[i] > avg) {
				System.out.print(names[i] + " ");
			}
		}
	}
	public static double calculateAverage(double[] arrayOfNumbers) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			sum += arrayOfNumbers[i];
		}
		double average = sum / arrayOfNumbers.length;
		return average;
	}
	//public static double CalculateMHR 
	// fix this code for the purpose the last user story
	public static boolean AskYesNO(Scanner methodInput) {
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
}