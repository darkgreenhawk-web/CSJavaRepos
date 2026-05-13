
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * 
 */

public class Project02Trainer
{
	public static void main(String[] args)
	{
		displayProgramSummary();

		// ===== TEST 1 =====
		String fileName = "team1.txt";

		try
		{
			System.out.println("\nTesting file: " + fileName);

			Team team = new Team("Nuggets", 6);

			teamSetUp(fileName, team);

			runAnalysis(team);

		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + fileName);
		}

		// ===== TEST 2 =====
		fileName = "team2.txt";

		try
		{
			System.out.println("\nTesting file: " + fileName);

			Team team = new Team("Team CS", 4);

			teamSetUp(fileName, team);

			runAnalysis(team);

		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + fileName);
		}

		System.out.println("\nEnd of program");
	}
	/**
     * Reads athlete data from a text file and adds each athlete to the Team object.
     * Each line of the file should follow the format: name weight height age.
     * @param fileName The name of the file to read.
     * @param team The Team object where athletes will be added.
     * @throws FileNotFoundException If the specified file does not exist.
     */
	public static void teamSetUp(String fileName, Team team) throws FileNotFoundException
	{
		// fill in reading information from a file
		File inputFile = new File(fileName);
        Scanner scanner = new Scanner(inputFile);
	
        while (scanner.hasNext()) {
        	String name = scanner.next();
        	double weight = scanner.nextDouble();
        	double height = scanner.nextDouble();
        	int age = scanner.nextInt();
        	
        	Athlete athlete = new Athlete(name, weight, height, age);
        	team.addAthlete(athlete);
        }
        scanner.close();
	}
	/**
     * Coordinates the analysis of the team, displaying results to the console
     * and writing them to a file.
     * @param team The Team object to analyze.
     */
	public static void runAnalysis(Team team) throws FileNotFoundException
	{
		System.out.println("\n========== Team Analysis ==========");
		System.out.println("Team: " + team.getTeamName());
		System.out.println("Total Athletes: " + team.getAthleteCount());
		System.out.println();

		team.displayAthleteResults();
		team.displayAthletesOutsideNormalBMI();

		double avg = team.calculateAverageMaxHeartRate();
		System.out.println("\nAverage Max Heart Rate: " + avg);

		team.displayAthletesAboveAverageMHR(avg);
		team.displayHighestMHR();
		team.displaySmallestLargestHeight();
		String outputFileName = team.getTeamName() + ".txt";
		team.writeAthletesToFile(outputFileName);

	}

	/**
     * Displays a brief overview of the program's capabilities to the console.
     */
	public static void displayProgramSummary()
	{
		System.out.println("**************************************");
		System.out.println("Team and Athlete Analysis");
		System.out.println("**************************************");
		System.out.println("Reads athlete data from file");
		System.out.println("Displays athlete results");
		System.out.println("Performs team analysis");
		System.out.println("Writes results to file\n");
	}
	
}
// ================= ADD ATHLETE CLASS =================
/**
 * Represents an individual athlete, storing their physical attributes and
 * providing methods for calculations like BMI and Max Heart Rate.
 */
class Athlete{
	private String name;
	private double weight;
	private double height;
	private int age;
	/**
     * Constructor for creating a new Athlete object.
     * @param name The athlete's name.
     * @param weight Weight in pounds.
     * @param height Height in inches.
     * @param age Age in years.
     */

	
	Athlete(String name, double weight, double height, int age) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}
	/**
	 * @return The athlete's name.
	 */
	public String getName() { 
		return name;
	}
	/**
	 *  @return The athlete's height. 
	 */
	public double getHeight() { 
		return height;
	}
	/**
     * Calculates Body Mass Index (BMI) using the standard formula.
     * @return Calculated BMI value.
     */
	public double calculateBMI() {
		return (weight / (height * height)) * 703;
	}
	/**
     * Determines the category of the athlete based on their BMI value.
     * @return A String representing the category (Underweight, Normal, or High).
     */
	public String determineBMICategory() {
        double bmi = calculateBMI();
        if (bmi < 18.5) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        return "High";
    }
	/**
     * Calculates the Max Heart Rate (MHR) as 220 minus age.
     * @return Calculated Max Heart Rate.
     */
	public int calculateMaxHeartRate() {
		return 220 - age;
	}
	/**
     * Displays the individual analysis for the athlete to the console.
     */
    public void displayAthleteAnalysis() {
        System.out.println(name);
        System.out.printf("BMI: %.1f\n", calculateBMI());
        System.out.println("Category: " + determineBMICategory());
        System.out.println("MHR: " + calculateMaxHeartRate() + "\n");
    }
}

/**
 * Manages a group of Athletes stored in an array and provides methods
 * for team analysis.
 */
class Team {
    private String teamName;
    private Athlete[] athletes;
    private int athleteCount;

    /**
     * Constructor for creating a new Team.
     * @param teamName The name of the team.
     * @param maxAthletes The maximum number of athletes the team can hold.
     */
    public Team(String teamName, int maxAthletes) {
        this.teamName = teamName;
        this.athletes = new Athlete[maxAthletes];
        this.athleteCount = 0;
    }

    /** 
     * @return The team's name. 
    */
    public String getTeamName() { 
    	return teamName; 
    }

    /**
     * @return The current number of athletes added to the team. 
     */
    public int getAthleteCount() { 
    	return athleteCount; 
    }

    /**
     * Adds an Athlete to the team array if space is available.
     * @param athlete The Athlete object to add.
     */
    public void addAthlete(Athlete athlete) {
        if (athleteCount < athletes.length) {
            athletes[athleteCount++] = athlete;
        } else {
            System.out.println("Team is full. Can't add " + athlete.getName());
        }
    }

    /**
     * Displays results for every athlete currently in the team.
     */
    public void displayAthleteResults() {
        for (int i = 0; i < athleteCount; i++) {
            athletes[i].displayAthleteAnalysis();
        }
    }

    /**
     * Lists athletes whose BMI falls outside the normal range (18.5 - 24.9).
     */
    public void displayAthletesOutsideNormalBMI() {
        System.out.println("Athletes Outside Normal BMI Range:");
        for (int i = 0; i < athleteCount; i++) {
            String category = athletes[i].determineBMICategory();
            if (category.equals("High")) {
                System.out.println("Above normal: " + athletes[i].getName());
            } else if (category.equals("Underweight")) {
                System.out.println("Below normal: " + athletes[i].getName());
            }
        }
    }

    /**
     * Calculates the average Max Heart Rate for the entire team.
     * @return The average team Max Heart Rate.
     */
    public double calculateAverageMaxHeartRate() {
        if (athleteCount == 0) return 0;
        double total = 0;
        for (int i = 0; i < athleteCount; i++) {
            total += athletes[i].calculateMaxHeartRate();
        }
        return total / athleteCount;
    }

    /**
     * Lists all athletes with a Max Heart Rate greater than or equal to the team average.
     * @param avg The team's average Max Heart Rate.
     */
    public void displayAthletesAboveAverageMHR(double avg) {
        System.out.println("\nAthletes above or equal to average MHR:");
        for (int i = 0; i < athleteCount; i++) {
            if (athletes[i].calculateMaxHeartRate() >= avg) {
                System.out.println(athletes[i].getName());
            }
        }
    }

    /**
     * Identifies and displays the athlete with the highest Max Heart Rate in the team.
     */
    public void displayHighestMHR() {
        if (athleteCount > 0) {
        	Athlete highest = athletes[0];
        	for (int i = 1; i < athleteCount; i++) {
        		if (athletes[i].calculateMaxHeartRate() > highest.calculateMaxHeartRate()) {
                highest = athletes[i];
            
        		}
        	}
        	System.out.println("\nHighest Max Heart Rate:\n" + highest.getName() + ": " + highest.calculateMaxHeartRate());
        }
        else 
        	System.out.println("|nNo Athletes to display:");
    }
    /**
     * Identifies and displays the shortest and tallest athletes on the team.
     */
    public void displaySmallestLargestHeight() {
        if (athleteCount > 0) {
        	Athlete shortest = athletes[0];
        	Athlete tallest = athletes[0];
        	for (int i = 1; i < athleteCount; i++) {
        		if (athletes[i].getHeight() < shortest.getHeight()) shortest = athletes[i];
        		if (athletes[i].getHeight() > tallest.getHeight()) tallest = athletes[i];
        	}
        	System.out.println("\nShortest Athlete:\n" + shortest.getName() + " - " + shortest.getHeight());
        	System.out.println("Tallest Athlete:\n" + tallest.getName() + " - " + tallest.getHeight());
        }
    }
    /**
     * Saves all athlete data and analysis to a text file named after the team.
     * @param fileName The name of the file to create.
     */
    public void writeAthletesToFile(String fileName) {
        File file = new File(fileName);
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("Team: " + teamName);
            writer.println("Total Athletes: " + athleteCount + "\n");
            for (int i = 0; i < athleteCount; i++) {
                writer.println(athletes[i].getName());
                writer.printf("BMI: %.1f\n", athletes[i].calculateBMI());
                writer.println("Category: " + athletes[i].determineBMICategory());
                writer.println("MHR: " + athletes[i].calculateMaxHeartRate() + "\n");
            }
            System.out.println("\nResults written to file: " + file.getAbsolutePath());
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + fileName);
        }
    }
}