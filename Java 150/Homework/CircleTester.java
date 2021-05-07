/*Michael Guarino
 * Class: CircleTester
 * Purpose: this is a tester for the Circle Class that asks for the user to input a radius
 * it then will return the Area, Circumference, and diameter of a circle with the given radius 
 * 
 */
package Homework;
import java.util.Scanner;

public class CircleTester {

	public static void main(String[] args) {
		
		//Scanner creates the scanner object keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//Printout asks the user for the radius 
		System.out.println("What is the radius of the circle?");
		
		double inputRadius = keyboard.nextDouble();
		
		//Method does the math and returns the answers
		Circle circle1 = new Circle(inputRadius);
		{
			System.out.println("The Area of your circle based on its radius is " + circle1.getArea());
			System.out.println("The Circumference of your circle based on its radius is " + circle1.getCircumference());
			System.out.println("The Diameter of your circle based on its radius is " + circle1.getDiameter());
			
			//Closes the Scanner Object
			keyboard.close();
		}
		

	}

}
