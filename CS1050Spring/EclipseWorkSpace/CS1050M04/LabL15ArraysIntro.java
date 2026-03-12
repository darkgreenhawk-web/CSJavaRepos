/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class LabL15ArraysIntro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students in the classs: ");
		int numberStudents = input.nextInt();
		double[] studentGrades = new double[numberStudents]; // Create array for grades
		String[] studentNames = new String[numberStudents]; // Create array for names
		
		for (int i = 0; i < n; i++) {
		      numbers[i] = input.nextDouble();
		      sum += numbers[i];
		    }
		    
		    double average = sum / n;

		    int count = 0; // The numbers of elements above average
		    for (int i = 0; i < n; i++)
		    {
		        // Count if number[i] > average
		         if (numbers[i] > average) 
		        {
		               count++;
		         }
		    }
	}

}
