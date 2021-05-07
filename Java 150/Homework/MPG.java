package Homework;
import java.util.Scanner;

public class MPG {
	
	public static void main(String[] args) {

		// Creates the Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Ask user the amount of miles driven and takes the keyboard input
		System.out.print("How many miles did you drive?");
		
		int inputMiles = keyboard.nextInt();
		
		// Ask user the amount of gallons used and takes the keyboard input
		System.out.print("How many gallons of gas were consumed?");
		
		int inputGallons = keyboard.nextInt();
		
		//Converts the two inputs into miles per gallon 
		int milesPerGallon = inputMiles/inputGallons;
		
		//Prints out the result
		System.out.println("Your car gets "+milesPerGallon+" miles to the gallon");
	}
}
