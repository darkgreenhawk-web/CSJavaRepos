/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class M02L06CharString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//double randomDouble = Math.random(); //0<value<1
	//int randomInt = (int) Math.random();
	//randomInt = (int) Math.random() * 10;
	//randomInt = (int) Math.random() * 10 + 1;
	//String firstName = "Heriberto";
	//int stringLength = firstName.length();
	//char firstInital = firstName.charAt(0);
	//char lastLetter = firstName.charAt(stringLength -1);
	//use Scanner to 
	Scanner keyboardInput = new Scanner(System.in);
	
	System.out.print("Enter a name ");
	
	String firstName = keyboardInput.next();
	
	char lastInital ='\n';
	
	int charAsciiValue = (int) lastInital;
	
	System.out.print("Enter last inital ");
	
	lastInital = keyboardInput.next().charAt(0);
	
	String summary = "Your name is " + firstName + " " + lastInital + ".";
	
	System.out.print(summary);
	
	keyboardInput.close();
	}

}
