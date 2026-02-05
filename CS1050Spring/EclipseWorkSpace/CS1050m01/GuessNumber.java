/**
 * This program takes user input to see if they can guess the 
 * random number generated. Add comments to explain the code.
 */

import java.util.Scanner;

public class GuessNumber //Declaring the Class for the file
{
	public static void main(String[] args) // main method
	{		
		//Declare a Constant int RANDOM_MULTIPLER then assigning it to 100
		final int RANDOM_MULTIPLIER = 100;
		//Declare the variable int number assign number to be a number between 1-100
		//Math.random gives a Double between 0.00 and 1.00 then multiplied it by 100
		int number = (int) (Math.random() * RANDOM_MULTIPLIER) + 1;
		//Calling the Class Scanner and assigning keyboardInput to the value input in the system input
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("Guess a magic number between 0 and 100");
		//declare integer guess assigning it to -1
		int guess = -1;
		//While is a loop keyword (guess != number) is checking for when the number and the guess are not equal != is not equal
		while (guess != number)
		{
			//
			System.out.print("\nEnter your guess: ");
			guess = keyboardInput.nextInt();

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

	}//end of main
}//end of class
