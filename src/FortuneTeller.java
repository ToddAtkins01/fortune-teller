
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Part 1

		// Ask the user for the user’s first name.
		System.out.println("Hello! Please enter your first name.");
		String firstName = input.next();

		// Ask the user for the user’s last name.
		System.out.println("Thank you! Please enter your last name.");
		String lastName = input.next();

		// Ask the user for the user’s age.
		System.out.println("Awesome! Now, enter your age please.");
		int age = input.nextInt();

		// Ask the user for the user’s birth month (as an 'int').
		System.out.println(
				"You're doing GREAT! Now, please enter your birth month in xx format.\n (Example: March would be 03.)");
		int birthMonth = input.nextInt();

		// Ask the user for the user’s favorite ROYGBIV color.
		System.out.println("Ok almost done. What is your favorite ROYGBIV color?");
		String favoriteColor = input.next();

		// Ask the user for the user's number of siblings.
		System.out.println("Alright! " +firstName + " Last question....I promise. ;-). How many siblings do you have?");
		
		// If the user does not know what ROYGBIV is, ask the user to enter “Help” to
		// get a list of the ROYGBIV colors.

		//
		// Part 2
		//
		// For each of the below, you will select your own value for each condition. The
		// table will give the conditions and an example for each. Don't steal our
		// examples—be creative!
		/// Retirement Years
		//
		// The user's number of years until retirement will be based on whether the
		// user's age is odd or even.
		/// (condition) If the user's age is… (example) then the user will retire in…
		// odd 14 years
		// even 12 years
		//
		// Vacation Home Location
		// The location of the user's vacation home will be based on how many siblings
		// the user has. If the user enters a number less than zero, give the user a bad
		// location!
		/// (condition) If the user's number of siblings is… (example) then the user's
		// vacation home will be in…
		// 0 Boca Raton, FL
		// 1 Nassau, Bahamas
		// 2 Ponta Negra,Brazil
		// 3 Portland, Oregon
		// greater than three Baton Rouge, LA
		// less than zero Chernobyl, Ukraine
		//
		// Mode of Transporation
		/// The user's mode of transportation will determined by the user's favorite
		// color.
		/// (condition) If the user's favorite color is… (example) then the user's mode
		// of transportation will be…
		// red Maserati
		// orange stallion
		// yellow chariot
		// green taxi
		// blue rickshaw
		// indigo motor scooter
		// violet flying saucer
		//
		// Bank Balance
		/// The user's bank balance at retirement will be based on the user's birth
		// month. If the user enters something other than 1-12 for birth month, the
		// user's balance will be $0.00.
		/// (condition) If the user's birth month is… (example) The user's balance will
		// be…
		// 1-4 $256,000.76
		// 5-8 $3,687,105.42
		// 9-12 $86.23
		// anything else $0.00

		// Part 3
		//
		// Display the user's fortune in this format:
		//
		// *[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank
		// balance]* in the bank,
		// a vacation home in *[location]*, and travel by *[mode of transporation]*.
		// Your program should be able to process input whether a user enters capital or
		// lowercase letters.

	}

}
