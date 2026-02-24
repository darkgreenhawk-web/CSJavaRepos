/**
 * Name: Andrew Rusch
 * Class: CS1050 T/TH
 * Description: Guided Exploration 01
 * The program will calculate a final grade for this class based on the category weights
 */

/**
 * 
 */
//
import java.util.Scanner;

public class GEM01GradeCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		//Declaring a CONSTANT doubles for weight of each category.
		final double CLASS_PARTICIPATION_WEIGHT = 0.15; 
		final double GUIDED_EXPLORATION_WEIGHT = 0.20;
		final double QUIZZES_WEIGHT = 0.25;
		final double PROJECTS_WEIGHT = 0.2;
		final double FINAL_DEMONOSTRATION_WEIGHT = 0.2;
		//Declaring the variable doubles for the grade of each category. 
		double classParticipationGrade = 95.0;
		double guidedExplorationGrade = 92.0;
		double quizzesGrade = 08.0;
		double projectsGrade = 87.0;
		double finalDemonostrationGrade = 03.0;
		//Declaring the strings for students first and last name.
		String firstName;
		String lastName;
		char firstIntital;
		char lastinital;
		
		//User inputs
		System.out.println("First name");
		firstName = keyboardInput.next();
		System.out.println("Last name");
		lastName = keyboardInput.next();
		System.out.println("Class Participation Grade");
		classParticipationGrade = keyboardInput.nextDouble();
		System.out.println("Guided Exploration Grade");
		guidedExplorationGrade = keyboardInput.nextDouble();
		System.out.println("Quizzes Grade");
		quizzesGrade = keyboardInput.nextDouble();
		System.out.println("Project Grade");
		projectsGrade = keyboardInput.nextDouble();
		System.out.println("Final Demonostration");
		finalDemonostrationGrade = keyboardInput.nextDouble();
		//Declaring the finalGrade as a double
		//Initializing fianlGrade as the result as the equation to get the finalGrade
		double finalGrade = CLASS_PARTICIPATION_WEIGHT * classParticipationGrade +
				GUIDED_EXPLORATION_WEIGHT * guidedExplorationGrade +
				QUIZZES_WEIGHT * quizzesGrade +
				PROJECTS_WEIGHT * projectsGrade +
				FINAL_DEMONOSTRATION_WEIGHT * finalDemonostrationGrade;
		//Output statement to the console printing text and the finalGrade
		firstInital = char(0)
		System.out.println("Total Final Grade for " + firstName + " " + lastName + " " + finalGrade);
		
		//if grade
		if (finalGrade >=90)
			{
			System.out.println("You got an A");
			}		
		else if (finalGrade >= 80) 
			{
			System.out.println("You got a B");
			}
		else if (finalGrade >= 70) 
			{
			System.out.println("You got a C");
			}
		else if (finalGrade >= 60) 
			{
			System.out.println("You got a D");
			}
		else 
			{				
			System.out.println("You got a F :(");	
			}		
		keyboardInput.close();
	}

}
