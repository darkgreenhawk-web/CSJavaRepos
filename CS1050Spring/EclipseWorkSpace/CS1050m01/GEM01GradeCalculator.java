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
		final double CLASS_PART_W = 0.15;
		final double GUIDED_EXP_W = 0.20;
		final double QUIZ_W = 0.25;
		final double PROJECTS_W = 0.2;
		final double FINAL_DEMO_W = 0.2;
		//Declaring the variable doubles for the grade of each category. 
		double classPartGrade = 95.0;
		double guidedExpGrade = 92.0;
		double quizGrade = 88.0;
		double projectsGrade = 87.0;
		double finalDemoGrade = 93.0;
		//Declaring the finalGrade as a double then in
		double finalGrade = CLASS_PART_W * classPartGrade +
				GUIDED_EXP_W * guidedExpGrade +
				QUIZ_W * quizGrade +
				PROJECTS_W * projectsGrade +
				FINAL_DEMO_W * finalDemoGrade;
		System.out.println ("Total Final Grade " + finalGrade);
		
	}

}
