
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Part 1

		// Ask the user for the user’s first name.
		// Ask the user for the user’s last name.
		// Ask the user for the user’s age.
		// Ask the user for the user’s birth month (as an 'int').
		// Ask the user for the user’s favorite ROYGBIV color.
		// If the user does not know what ROYGBIV is, ask the user to enter “Help” to
		// get a list of the ROYGBIV colors.
		// Ask the user for the user's number of siblings.

		System.out.println("Hello! Please enter your first name.");
		String firstName = input.next();
		String upperFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);

		System.out.println("Thank you! Please enter your last name.");
		String lastName = input.next();
		String upperLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

		System.out.println("Awesome! Now, enter your age please.");
		int age = input.nextInt();

		System.out.println("You're doing GREAT! Now, please enter your birth month in xx format.\n"
				+ " (Example: March would be 03.)");
		int birthMonth = input.nextInt();

		System.out.println("Ok almost done. What is your favorite ROYGBIV color?");

		System.out.println("(Not sure what ROYGBIV is? Just type \"Help\" to find out.)");
		String favoriteColor = input.next();
		while (favoriteColor.equalsIgnoreCase("Help")) {
			System.out.println("R = Red  O = Orange  Y = Yellow  G = Green  B = Blue  I = Indigo  V = Violet");

			System.out.println("Ok let's try this again. What is your favorite ROYGBIV color?");
			System.out.println("(Still not sure what ROYGBIV is? Remeber, Just type \"Help\" to find out.)");
			favoriteColor = input.next();
			if (favoriteColor.equalsIgnoreCase("red") || favoriteColor.equalsIgnoreCase("orange")
					|| favoriteColor.equalsIgnoreCase("yellow") || favoriteColor.equalsIgnoreCase("green")
					|| favoriteColor.equalsIgnoreCase("blue") || favoriteColor.equalsIgnoreCase("indigo")
					|| favoriteColor.equalsIgnoreCase("violet")) {
				break;
			}

		}

		System.out.println(
				"Alright! " + upperFirstName + " Last question....I promise. ;-). How many siblings do you have?");
		int numberOfSiblings = input.nextInt();

		//
		// Part 2
		//
		// For each of the below, you will select your own value for each condition. The
		// table will give the conditions and an example for each. Don't steal our
		// examples—be creative!

		/// Retirement Years
		// The user's number of years until retirement will be based on whether the
		// user's age is odd or even.
		/// (condition) If the user's age is… (example) then the user will retire in…
		// odd 25 years
		// even 16 years
		if (age % 2 != 0) {
			age = (25);

		} else {

			age = (16);
		}

		// Vacation Home Location
		// The location of the user's vacation home will be based on how many siblings
		// the user has. If the user enters a number less than zero, give the user a bad
		// location!
		/// (condition) If the user's number of siblings is… (example) then the user's
		// vacation home will be in…
		// 0 Savannah, Ga
		// 1 Abruzzo, Italy
		// 2 Zermatt, Switzerland
		// 3 Bora Bora
		// greater than three Cape Cora, Florida
		// less than zero Lake Chapala, Jalisco

		if (numberOfSiblings == 0) {
			String vacationHome = "Savannah, Ga";
		} else if (numberOfSiblings == 1) {
			String vacationHome = "Abruzzo, Italy";
		} else if (numberOfSiblings == 2) {
			String vacationHome = "Zermatt, Switzerland";
		} else if (numberOfSiblings == 3) {
			String vacationHome = "Bora Bora";
		} else if (numberOfSiblings >= 3) {
			String vacationHome = "Cora, Florida";
		} else {
			String vacationHome = "Lake Chapala, Jalisco";
		}

		// Mode of Transporation
		/// The user's mode of transportation will determined by the user's favorite
		// color.
		/// (condition) If the user's favorite color is… (example) then the user's mode
		// of transportation will be…
		// red Huffy
		// orange Ford Pinto
		// yellow Uber/Lyft
		// green Teleport
		// blue Bentley Mulsanne
		// indigo Honda Odyssey
		// violet Hyperloop
		if (favoriteColor.equalsIgnoreCase("red")) {
			String modeOfTransportation = "Huffy";
		} else if (favoriteColor.equalsIgnoreCase("orange")) {
			String modeOfTransportation = "Ford Pinto";
		} else if (favoriteColor.equalsIgnoreCase("yellow")) {
			String modeOfTransportation = "Uber/Lyft";
		} else if (favoriteColor.equalsIgnoreCase("green")) {
			String modeOfTransportation = "Teleport";
		} else if (favoriteColor.equalsIgnoreCase("blue")) {
			String modeOfTransportation = "Bentley Mulsanne";
		} else if (favoriteColor.equalsIgnoreCase("indigo")) {
			String modeOfTransportation = "Honda Odysseye";
		} else if (favoriteColor.equalsIgnoreCase("violet")) {
			String modeOfTransportation = "Hperloop";
		} else {
			String modeOfTransportation = "Rocket to the moon for not answering correctly.";
		}
		//
		// Bank Balance
		/// The user's bank balance at retirement will be based on the user's birth
		// month. If the user enters something other than 1-12 for birth month, the
		// user's balance will be $0.00.
		/// (condition) If the user's birth month is… (example) The user's balance will
		// be…
		// 1-3 $5,999,123.56
		// 4-6 $265,395.99
		// 6-8 $1
		// 9-12 $2,145,203.97
		// anything else -$376,983.83
		if (birthMonth == 1 || birthMonth == 2 || birthMonth == 3) {
			String bankBalance = "$5,999,123.56";
		} else if (birthMonth == 4 || birthMonth == 5 || birthMonth == 6) {
			String bankBalance = "$265,395.99";
		} else if (birthMonth == 7 || birthMonth == 8 || birthMonth == 9) {
			String bankBalance = "$1";
		} else if (birthMonth == 10 || birthMonth == 11 || birthMonth == 12) {
			String bankBalance = "$2,145,203.97";
		} else {
			String bankBalance = "-$376,983.83";
		}
		// Part 3
		//
		// Display the user's fortune in this format:
		//
		// *[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank
		// balance]* in the bank,
		// a vacation home in *[location]*, and travel by *[mode of transporation]*.
		// Your program should be able to process input whether a user enters capital or
		// lowercase letters.
		System.out.println(upperFirstName + " " + upperLastName + " will retire in " + age + " years with ") + bankBalance  + " in the bank, a vacation home in " + vacationHome + ", and travel by " + modeOfTransportation + ".");

		input.close();

	}

}
