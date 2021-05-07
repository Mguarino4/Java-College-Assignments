/*Michael Guarino
 * Class: GeometryCalculatorTester
 * Purpose: this is a tester for the GeometryCalculator Class that asks for the user to input a chosen
 * shape to have the area of that shape calculated, it will then ask for the required parameters to calculate the area of the chosen shape 
 * if the parameters are negative it will give you an error indicating witch parameter is invalid
 * This class uses Switch statements for choosing the desired Shape to be calculated 
 * it also uses a do while loop to ensure that a valid menu option is chosen
 */
package Homework;
import java.util.Scanner;

public class GeometryCalculatorTester {

	public static void main(String[] args) {
		
		//Scanner creates the scanner object keyboard
		Scanner keyboard = new Scanner(System.in);
		
		
		//Menu Printouts Asks the user which shape they need the area for
		System.out.println("Geometry Calculator");
		System.out.println("1. Calculate the area of a Circle");
		System.out.println("2. Calculate the area of a Rectangle");
		System.out.println("3. Calculate the area of a Triangle");
		System.out.println("4. Quit");
		System.out.println("Enter your choice (1-4):");
		
		int inputNumber = keyboard.nextInt();
		
		//Do-While loop makes sure that the menu choice is valid
		while (inputNumber < 1 ||  inputNumber > 4)
		{
			System.out.println("Invalid choice. Please try again");
			inputNumber = keyboard.nextInt();
		}
		
		//Cases specific to the shape being calculated chosen in the menu
		//All cases use if statements to make sure a negative field isnt passed through
		switch(inputNumber)
		{
		case 1:
			System.out.println("What is the radius of your Circel?");
			double inputRadius = keyboard.nextDouble();
			GeometryCalculator.radius = (inputRadius);
			
			if(inputRadius < 0)
				System.out.println("A negative radius does not apply");
			else
			System.out.println("The area of your Cirlce is "+ GeometryCalculator.circleArea());
			break;
			
		case 2: 
			System.out.println("What is the width of your Rectangle?");
			double inputWidth = keyboard.nextDouble();
			GeometryCalculator.width = (inputWidth);
			
			System.out.println("What is the length of your Rectangle?");
			double inputLength = keyboard.nextDouble();
			GeometryCalculator.length = (inputLength);
			
			if(inputWidth <0)
				System.out.println("A negative width does not apply");
			if(inputLength <0)
				System.out.println("A negative length does not apply");
			else
			System.out.println("The area of your Recatangle is " + GeometryCalculator.rectangleArea());
			break;
			
		case 3:
			System.out.println("What is the base of your Triangle?");
			double inputBase = keyboard.nextDouble();
			GeometryCalculator.base = (inputBase);
			
			System.out.println("What is the height of your Triangle?");
			double inputHeight = keyboard.nextDouble();
			GeometryCalculator.height = (inputHeight);
			
			if(inputBase < 0)
				System.out.println("A negative base does not apply");
			if(inputHeight < 0)
				System.out.println("A negative height does not apply");
			else
			System.out.println("The area of your Triangle is " + GeometryCalculator.triangleArea());
			break;
		case 4:
			System.out.println("Exiting Geometry Calculator");

		//Closes the scanner
		keyboard.close();

	}

}
}
	

