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
		
		// ask for class size to set the size of the array since arrays are fixed size once created
		//so we ask for the amount before we make the array
		System.out.println("How many students in the classs: ");
		int numberStudents = input.nextInt();
		
		//two arrays initialized based on the same input making them the same length
		//since both arrays are the same length we can use each index as a identifier for each student
		double[] studentGrades = new double[numberStudents]; // Create array for grades
		String[] studentNames = new String[numberStudents]; // Create array for names
		//we pass the values of the array not the array itself
		
		fillStudentData(studentNames, studentGrades, input);
		
		double average = calculateAverage(studentGrades);
		
		displayAboveAverage(studentNames, studentGrades, average);
	}
	private static double calculateAverage(double[] grades) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		double average = sum / grades.length;
		return average;
	}
	public static void fillStudentData(String[] names, double[] grades, Scanner methodInput) {
		for (int i = 0; i < names.length; i++) {
			System.out.print("Enter first name of student " + (i + 1));
			names[i] = methodInput.next();
			System.out.print("Enter grade for " + names[i]);
			grades[i] = methodInput.nextDouble();
		}
	}
	//we declare new strings here 
	public static void displayAboveAverage(String[] names, double[] grades, double avg) {
		System.out.println("Students who scored above average:");
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > avg) {
				System.out.print(names[i] + " ");
			}
		}
	}

}
