/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class ConcertTicketPrices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		int row;
		double cost;
		char sectLetter;
		String section;
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("What Section F(Front) C(Center) S(Side) U(Upper)");
		//have the user give a string and take the first letter
		sectLetter = keyboardInput.next().charAt(0);
		//make sure the first letter is capitalized
		sectLetter = Character.toUpperCase(sectLetter);
		
		switch (sectLetter){
			case 'F':
				section = "Front.";
				break;
			case 'C':
				section = "Center.";
				break;
			case 'S':
				section = "Side.";
				break;
			case 'U':
				section = "Upper.";
				break;
			default :
				section = "invalid Section";
				break;
		}
		System.out.println("You selected section " + section);
		//if statement to grab 
		if (section != "invalid Section") 
			{
			System.out.println("What Rows 1-15 Cost $450 Rows 16-30 Cost $300 Rows 31-60 Cost $200");
			//grab a integer from the user input
			row = keyboardInput.nextInt();
			//
			if (row >= 1 && row <= 60)
				{
				if (row <= 15)
					{
					cost = 450;
					}
				else if (row <= 30)
					{
					cost = 300;
					}
				else
					{
					cost = 200;
					}
				System.out.println("Your Row is " + row);
				System.out.println("Section " + section + " Row " + row + ".");
				System.out.println("Ticket " + sectLetter + row + " Cost $" + cost);
				}
			//else for invalid row
			else 
				{
			System.out.println("Invalid Row: Exiting program.");
				}
			}
		//Else for invalid section 
		else 
			{
			System.out.println("Invalid Section: Exiting program.");
			}
		keyboardInput.close();
	}

}
