/**
 * 
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
		final double CLASS_PART_W = 0.15;
		final double GUIDED_EXP_W = 0.20;
		final double QUIZ_W = 0.25;
		final double PROJECTS_W = 0.2;
		final double FINAL_DEMO_W = 0.2;
		double classPartGrade = 95.0;
		double guidedExpGrade = 92.0;
		double quizGrade = 88.0;
		double projectsGrade = 87.0;
		double finalDemoGrade = 93.0;
		
		double finalGrade = CLASS_PART_W * classPartGrade + GUIDED_EXP_W * guidedExpGrade + QUIZ_W * quizGrade + PROJECTS_W * projectsGrade + FINAL_DEMO_W * finalDemoGrade;
		System.out.println (finalGrade);
		
	}

}
