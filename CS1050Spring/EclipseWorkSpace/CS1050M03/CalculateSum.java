/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class CalculateSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//int max;
		int sum;
	//	max = input.nextInt();
		System.out.println("Input max iterations to sum.");
		sum = calculateSum(input.nextInt());
		//sum = calculateSum(max);
		System.out.println("Sum is " + sum);
		input.close();
	}
	public static int calculateSum(int max) {
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			sum = sum + i;
		}
			
		return sum;
	}
}
