import java.util.Scanner;

/**
 * Name: Andrew, Rusch
 * Class CS1030 T/TH
 * 
 * Athlete Tracker Project iteration 1
 * This program tracks and analyzes team fitness metrics including BMI, 
 * Max Heart Rate, and specific training zones.
 */
public class FirstIterofProjectAthleteTracker {

    /**
     *  This is where we call each method in main to run through all the user stories
     * tried my best with commenting on this one used the generate comments button a lot to show parameters and returns
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        displayOverview();
        //User Story 2: Specify Number of Athletes
        int numAthletes = getValidInt(input, "Enter the number of athletes on the team: ");
        //three parallel strings that should hold be the same length so we can keep track of each athlete by their index.
        String[] names = new String[numAthletes];
        double[] bmis = new double[numAthletes];
        double[] mhrs = new double[numAthletes];
        //probably could be a int but the percent calculation can output a double
        // users stories 3 - 5 data collection
        fillAthletesData(numAthletes, names, bmis, mhrs, input);
       
        // user story 6 just a loop that prints the data fed to it
        displayAthleteSummary(names, bmis, mhrs);
        // user story 7: List all athletes outside normal BMI range
        // this will take the parallel arrays names and bmis and output the above and below the thresholds for normal
        displayBmiAnalysis(names, bmis);
        //User Story 8: Calculate and Display Average of the Max Heart Rates
        displayAverageMHR(mhrs);
        //User Story 9: Identify Athlete with Highest Max Heart Rate
        displayHighestMHR(names, mhrs);
        //User Story 10: List all athletes above or equal to Max Heart Rate average
        displayAboveAverageMHR(names, mhrs);
        //User Story 11: Calculate and Display Training Heart Rate
        processTrainingHeartRates(names, mhrs, input);
        //close input
        input.close();
    }

    /** User story 1: View Program Overview
     * Displays the program purpose and BMI category definitions to the user.
     */
    public static void displayOverview() {
        System.out.println("**************************************");
        System.out.println("Program Overview");
        System.out.println("**************************************");
        System.out.println("This program analyzes athlete BMI and Heart Rate metrics.");
        System.out.println("BMI Categories\nUnder 18.5: Underweight\n18.5 to under 30: Normal\n30 or greater: High\n");
    }

    /** User Story 3 through 5
     * Loops through the team to collect name, weight, height, and age,
     * then calculates and stores BMI and Max Heart Rate.
     * @param numAthletes The total number of athletes to process.
     * @param names Array to store athlete names.
     * @param bmis Array to store calculated BMIs.
     * @param mhrs Array to store calculated Max Heart Rates.
     * @param input Scanner object for user input.
     */
    public static void fillAthletesData(int numAthletes, String[] methodnames, double[] methodbmis, double[] methodmhrs, Scanner methodInput) {
        for (int i = 0; i < numAthletes; i++) {
            System.out.println("\nEnter data for athlete " + (i + 1));
            System.out.print("Enter athlete's first name: ");
            
            methodnames[i] = methodInput.next(); 

            double weight = getValidDouble(methodInput, "Enter weight in pounds: ");
            double height = getValidDouble(methodInput, "Enter height in inches: ");
            int age = getValidInt(methodInput, "Enter age in years: ");
          	//Wasn't sure if a method was required here since its only used here so far with both of these but can easily make one.
            methodbmis[i] = (703 * weight) / (height * height);
            methodmhrs[i] = 220 - age;
        }
    }

    /** 
     * Prints a formatted summary for every athlete including their name, 
     * BMI value, category, and Max Heart Rate.
     * @param names Array of athlete names.
     * @param bmis Array of athlete BMIs.
     * @param mhrs Array of athlete MHRs.
     */
    public static void displayAthleteSummary(String[] names, double[] bmis, double[] mhrs) {
        System.out.println("\n========== Athlete Summary ==========");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            System.out.printf("BMI: %.1f\n", bmis[i]);
            System.out.println("Category: " + getBMICategory(bmis[i]));
            System.out.println("MHR: " + mhrs[i] + "\n");
        }
    }

    /**
     * User Story 7: List all athletes outside normal BMI range
     * Uses getBMICategory to filter athletes into lists.
     * @param names Array of athlete names.
     * @param bmis Array of athlete BMIs.
     */
    public static void displayBmiAnalysis(String[] names, double[] bmis) {
        System.out.println("========== BMI Analysis ==========");
        
        // Strings for storing the names for names
        String aboveNormal = "";
        String belowNormal = "";

        for (int i = 0; i < bmis.length; i++) {
            //calls category method to be filtered by the if statements below
        	//using the category method allows us to change the categories here instead of hard coding it here
            String category = getBMICategory(bmis[i]);

            // SORTING based on the return value of category method
            if (category.equals("Obese") || category.equals("OverWeight")) {
                // I like this adding of names to the string instead of sorting through twice
            	// += is nice for this purpose
            	aboveNormal += names[i] + " ";
            } 
            
            else if (category.equals("Underweight")) {
                belowNormal += names[i] + " ";
            }
        }

        // checks if the strings are empty and uses that as a flag to check if there was a athlete outside normal.
        if (aboveNormal.isEmpty() && belowNormal.isEmpty()) {
            System.out.println("No athletes outside of normal range");
        } else {
            // .trim() removes the extra space at the end that was bothering me.
        	
        	// we check if a string was empty again to cut out a response if it had no data.
            if (!aboveNormal.isEmpty()) {
                System.out.println("BMI Above normal: " + aboveNormal.trim());
            }
            if (!belowNormal.isEmpty()) {
                System.out.println("BMI Below normal: " + belowNormal.trim());
            }
        }
    }

    public static double getAverage(double[] data) {
        double sum = 0;
        
        // Check to prevent division by zero if array is empty
        if (data.length == 0) {
            return 0.0;
        }

        // Standard loop using index 'i'
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }

        return sum / data.length;
    }
    /**
     * Calculates the mathematical average of the team's Max Heart Rates 
     * and displays it to one decimal place.
     * @param mhrs Array containing Max Heart Rate data.
     */
        public static void displayAverageMHR(double[] mhrs) {
        	double avgMHR = getAverage(mhrs); // assuming mhrs is double[]
        	System.out.printf("Average Max Heart Rates: %.1f\n", avgMHR);
        }

    /**
     * Finds and displays the specific athlete with the single highest MHR. using find max index method
     * @param names Array of athlete names.
     * @param mhrs Array of athlete MHRs.
     */
    public static void displayHighestMHR(String[] names, double[] mhrs) {
        int maxIndex = findMaxIndex(mhrs);
        System.out.println("\n========== HIGHEST CAPACITY ==========");
        System.out.println(names[maxIndex] + " has highest max heart rate: " + (int) mhrs[maxIndex]);
    }

    /**
     * Compares each athlete's MHR against the team average and lists 
     * those who meet or exceed it.
     * @param names Array of athlete names.
     * @param mhrs Array of athlete MHRs.
     */
    public static void displayAboveAverageMHR(String[] names, double[] mhrs) {
        // 1. Calculate the average first using getAverage
        double avgMHR = getAverage(mhrs);
        
        System.out.println("\nAthletes above or equal to average MHR:");

        // 2. Use a standard loop to find matches
        for (int i = 0; i < mhrs.length; i++) {
            // 3. Compare the current athlete's MHR to the team average
            if (mhrs[i] >= avgMHR) {
                // 4. Use 'i' to get the matching name
                System.out.println(names[i]);
            }
        }
    }

    /**
     * Handles the optional user request to calculate a specific 
     * training intensity heart rate for all athletes.
     * @param names Array of athlete names.
     * @param mhrs Array of athlete MHRs.
     * @param input Scanner object for user input.
     */
    public static void processTrainingHeartRates(String[] names, double[] mhrs, Scanner input) {
        if (askYesNo(input, "Do you want to calculate the training heart rates? (y/n): ")) {
            double percentage = getValidDouble(input, "Enter training percentage: ");
            System.out.println();
            for (int i = 0; i < names.length; i++) {
                double trainingRate = mhrs[i] * (percentage / 100.0);
                System.out.printf("%s Training Heart Rate: %.1f\n", names[i], trainingRate);
            }
        }
        System.out.println("\nTraining Program Analysis complete");
    }

    /**
     * Determines the descriptive category based on a BMI value.
     * @param currentBMI The BMI value to evaluate.
     * @return A String representing the weight category.
     * just copied from a old piece of code we wrote
     */
    public static String getBMICategory(double currentBMI) {
        String category = "";
        if (currentBMI >= 30.0) {
        	category = "Obese";
        }
        else if (currentBMI >= 25) { 
        	category = "Overweight";
        	}
        else if (currentBMI >= 18.5) {
        	category = "Normal";
        }
        else {
        	category = "Underweight";
        }
        return category;
    }

    /**
     * Iterates through a double array to find the location of the largest value.
     * @param currentArray The array to search.
     * @return The index of the highest value found.
     */
    public static int findMaxIndex(double[] currentArray) {
        int maxIndex = 0;
        double maxValue = currentArray[0];
        // can be used on any numbered array in case we wanted to use it on MHR or BMI
        for (int i = 1; i < currentArray.length; i++) {
            
        	if (currentArray[i] > maxValue) {
                maxValue = currentArray[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * Prompt for and validates a Yes/No response.
     * @param input Scanner object.
     * @param prompt The question to display to the user.
     * @return true if 'y' or 'Y', false if 'n' or 'N'.
     */
    public static boolean askYesNo(Scanner input, String prompt) {
        boolean result = false;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            
            String response = input.next();
            //ignores case and is just looking for a y or n
            if (response.equalsIgnoreCase("y")) {
                result = true;
                isValid = true;
            } else if (response.equalsIgnoreCase("n")) {
                result = false;
                isValid = true;
            } else {
                System.out.println("Error: enter y, Y, n, or N.");
            }
        }
        return result;
    }

    /**
     * Validates that the user input is a whole number greater than zero.
     * @param methodInput Scanner object.
     * @param prompt The prompt to display.
     * @return A valid positive integer.
     */
    public static int getValidInt(Scanner methodInput, String prompt) {
        int value = 0;
        boolean flag = false;
        while (!flag) {
            System.out.print(prompt);
            //checks if its a double
            if (methodInput.hasNextInt()) {
            	// then stores the int
                value = methodInput.nextInt();
                //sets flag to true to stop loop
                if (value > 0) flag = true;
                else System.out.println("Error: value must be greater than 0.");
            } else {
            	//clears the input for the loop if you put in the wrong data type
                methodInput.next();
                System.out.println("Error: value must be a number.");
            }
        }
        return value;
    }

    /**
     * Validates that the user input is a decimal number greater than zero.
     * @param methodInput Scanner object.
     * @param prompt The prompt to display.
     * @return A valid positive double.
     */
    public static double getValidDouble(Scanner methodInput, String prompt) {
        double value = 0;
        boolean flag = false;
        while (!flag) {
            System.out.print(prompt);
            //checks if its a double
            if (methodInput.hasNextDouble()) {
            	// then stores the double
                value = methodInput.nextDouble();
                //sets flag to true to stop loop
                if (value > 0) flag = true;
                
                else System.out.println("Error: value must be greater than 0.");
            } else {
            	//clears the input for the loop if you put in the wrong data type
                methodInput.next();
                System.out.println("Error: value must be a number.");
            }
        }
        //returns once loop stopped
        return value;
    }
}
