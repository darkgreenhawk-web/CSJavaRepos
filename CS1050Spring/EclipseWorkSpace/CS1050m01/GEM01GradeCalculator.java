/**
 * Name: Andrew Rusch
 * Class: CS1050 T/TH
 * Description: Guided Exploration 01
 * The program will calculate a final grade for this class based on the category weights
 */

/**
 * 
 */
public class GEM01GradeCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring a CONSTANT doubles for weight of each category.
		final double CLASS_PARTICIPATION_WEIGHT = 0.15; 
		final double GUIDED_EXPLORATION_WEIGHT = 0.20;
		final double QUIZZES_WEIGHT = 0.25;
		final double PROJECTS_WEIGHT = 0.2;
		final double FINAL_DEMONOSTRATION_WEIGHT = 0.2;
		//Declaring the variable doubles for the grade of each category. 
		double classParticipationGrade = 95.0;
		double guidedExplorationGrade = 92.0;
		double quizzesGrade = 88.0;
		double projectsGrade = 87.0;
		double finalDemonostrationGrade = 93.0;
		//Declaring the finalGrade as a double then in running the equation to get the final grade.
		double finalGrade = CLASS_PARTICIPATION_WEIGHT * classParticipationGrade +
				GUIDED_EXPLORATION_WEIGHT * guidedExplorationGrade +
				QUIZZES_WEIGHT * quizzesGrade +
				PROJECTS_WEIGHT * projectsGrade +
				FINAL_DEMONOSTRATION_WEIGHT * finalDemonostrationGrade;
		System.out.println ("Total Final Grade for Andrew Rusch " + finalGrade);
		
	}

}
