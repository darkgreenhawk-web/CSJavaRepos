/**
 * This program takes user input to see if they can guess the 
 * random number generated. Add comments to explain the code.
 */

import java.util.Scanner; // Import Scanner class for keyboard input

public class RuschAndrewGuessNumber //Declaring the Class for the file
{
	public static void main(String[] args) // Main method where the program starts
	{		
		//Declare a Constant integer "RANDOM_MULTIPLER" then assigning it to 100
		final int RANDOM_MULTIPLIER = 100;
		//Declare the variable integer "number" 
		//Assign "number" to be the result of Math.random time RANDOM_MULTIPLIER
		//Math.random gives a Double between 0.00 and 1.00
		//Cast the number to a integer with (int)
		//multiply by the RANDOM_MULTIPLER to get a integer ahead of the decimal
		//add one to make sure the number is at least 1
		//cast the number to int to remove the remaining decimal
		int number = (int) (Math.random() * RANDOM_MULTIPLIER) + 1;
		//calls the Class Scanner to declare a object named 'keyboardInput'
		//Initialize it to read from the keyboard (System.in)
		Scanner keyboardInput = new Scanner(System.in);
		//Output statement to the console
		System.out.println("Guess a magic number between 0 and 100");
		//declare integer 'guess'
		//Initialize guess by assigning it to -1 
		//-1 is not in the range of random guesses so this will allow the loop to start
		int guess = -1;
		//While is a loop keyword (guess != number) is checking for when the number and the guess are not equal != is not equal
		//loops will run the code between the following { } till the condition is met for it to move on
		//this loop will keep running till the guess and random number are equal.
		while (guess != number)
		{
			//Output statement to the console
			//Prompt to user to input a number
			System.out.print("\nEnter your guess: ");
			//assign guess to the input given by keyboardInput
			guess = keyboardInput.nextInt();
			//Conditional statement
			if (guess == number) 
			{
				System.out.println("Yes, the number is " + number);
			}
			else if (guess > number)
			{
				System.out.println("Your guess is too high");
			}
			else
			{
				System.out.println("Your guess is too low");
			}
		}
		keyboardInput.close();
	}//end of main
}//end of class
