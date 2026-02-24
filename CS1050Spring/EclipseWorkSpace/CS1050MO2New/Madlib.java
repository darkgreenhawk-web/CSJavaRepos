
/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Madlib {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboardInput = new Scanner(System.in);
	//strings are a 
	String firstName;
	String lastName;
	String noun;
	String adjective;
	String verbWithIng;
	String place;
	//char data type is a single character is a simple data type only storing a single point of data
	char favoriteLetter;
	char firstLetterLastName;
	
	System.out.println("First name");
	firstName = keyboardInput.next();
	System.out.println("Last Name");
	firstLetterLastName = keyboardInput.next().charAt(0);
	System.out.println("Noun");
	noun = keyboardInput.next();
	System.out.println("adjective");
	adjective = keyboardInput.next();
	System.out.println("Verb with ending with ING");
	verbWithIng = keyboardInput.next();
	System.out.println("Place");
	place = keyboardInput.next();
	System.out.println("Favorite Letter");
	favoriteLetter = keyboardInput.next().charAt(0);
	
	
	
	System.out.println("Once upon a time, " + firstName +  " " + firstLetterLastName +
	" was " + verbWithIng + " through the " +
	place +" with a " + noun + ". It was a very " + 
	adjective + " day. Their favorite letter was " + favoriteLetter + " .");
		
	}

}
