import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Part 1
	

		System.out.println("Hello! Please enter your first name.");
		String firstName = input.next();
		String upperFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);

		System.out.println("Thank you! Please enter your last name.");
		String lastName = input.next();
		String upperLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

		System.out.println("Awesome! Now, enter your age please.");
		int age = input.nextInt();

		System.out.println("You're doing GREAT! Now, please enter your birth month.");
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

		// Part 2

		if (age % 2 != 0) {
			age = (25);
		} else {
			age = (16);
		}

		String vacationHome = null;
		if (numberOfSiblings == 0) {
			vacationHome = "Savannah, Ga";
		} else if (numberOfSiblings == 1) {
			vacationHome = "Abruzzo, Italy";
		} else if (numberOfSiblings == 2) {
			vacationHome = "Zermatt, Switzerland";
		} else if (numberOfSiblings == 3) {
			vacationHome = "Bora Bora";
		} else if (numberOfSiblings >= 3) {
			vacationHome = "Cora, Florida";
		} else {
			vacationHome = "Lake Chapala, Jalisco";
		}

		String modeOfTransportation = null;
		if (favoriteColor.equalsIgnoreCase("red")) {
			modeOfTransportation = "Huffy";
		} else if (favoriteColor.equalsIgnoreCase("orange")) {
			modeOfTransportation = "Ford Pinto";
		} else if (favoriteColor.equalsIgnoreCase("yellow")) {
			modeOfTransportation = "Uber/Lyft";
		} else if (favoriteColor.equalsIgnoreCase("green")) {
			modeOfTransportation = "Teleport";
		} else if (favoriteColor.equalsIgnoreCase("blue")) {
			modeOfTransportation = "Bentley Mulsanne";
		} else if (favoriteColor.equalsIgnoreCase("indigo")) {
			modeOfTransportation = "Honda Odysseye";
		} else if (favoriteColor.equalsIgnoreCase("violet")) {
			modeOfTransportation = "Hperloop";
		} else {
			modeOfTransportation = "Rocket to the moon for not answering correctly.";
		}
	
		String bankBalance = null;
		if (birthMonth == 1 || birthMonth == 2 || birthMonth == 3) {
			bankBalance = "$5,999,123.56";
		} else if (birthMonth == 4 || birthMonth == 5 || birthMonth == 6) {
			bankBalance = "$265,395.99";
		} else if (birthMonth == 7 || birthMonth == 8 || birthMonth == 9) {
			bankBalance = "$1.00";
		} else if (birthMonth == 10 || birthMonth == 11 || birthMonth == 12) {
			bankBalance = "2,145,203.97";
		} else {
			bankBalance = "$-376,983.83";
		}
		// Part 3
	
		System.out.println(upperFirstName + " " + upperLastName + " will retire in " + age + " years with "
				+ bankBalance + " in the bank, a vacation home in " + vacationHome + ", and travel by "
				+ modeOfTransportation + ".");

		input.close();

	}

}
