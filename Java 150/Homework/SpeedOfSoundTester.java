/*Michael Guarino
 * Class: SpeedOfSoundTester
 * Purpose: this is a tester for the SpeedOfSound Class that asks for the user to input a chosen
 * medium and the distance a sound traveled, it will then return how long it took that sound to travel through the chosen medium 
 * This class uses Switch statements for choosing the desired Medium
 */
package Homework;
import java.util.Scanner;

public class SpeedOfSoundTester {

	public static void main(String[] args) {
		
		//Scanner Creates the scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Printouts Asks the user which Medium and how far the wave traveled
		System.out.println("Choose a # : ");
		System.out.println("1 : Speed in Air");
		System.out.println("2 : Speed in Water");
		System.out.println("3 : Speed in Steel");
		
		int inputNumber = keyboard.nextInt();
		
		
		System.out.println("How far did the sound wave travel?");
		
		double inputDistance = keyboard.nextDouble();
		
		//Constructor Creates the object passing through the distance
		SpeedOfSound speed1 = new SpeedOfSound(inputDistance);
		
		
		//Cases Case is made earlier based on user chosen Medium
		switch(inputNumber)
		{
		case 1:
			System.out.println("It will take " + speed1.getSpeedInAir() + " seconds");
			
			break;
		
		case 2:
			System.out.println("It will take " + speed1.getSpeedInWater() + " seconds");
			
			break;
		
		case 3:
			System.out.println("It will take " + speed1.getSpeedInSteel() + " seconds");
			
			break;
			
		}
		
		//Closes the Scanner Object
		keyboard.close();

	}

}
