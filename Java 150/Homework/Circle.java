/* Michael Guarino
 * Class: Circle
 * Purpose: This class creates circle objects using a final variable pi and a private variable radius
 * This class uses Accesor and Mutator methods as well as a Constructor to store and retrieve data from refernce variables
 * 09/2019
 */
package Homework;

public class Circle {
	
		//Private variables and makes one a final variable
		private double radius;
		private final double pi = 3.14159;
		
		//Constructor
		public Circle(double radius)
		{
			this.radius = radius;
		}
		
		//Setters
		public void setRadius(double radius)
		{
			this.radius = radius;
		}
		
		//Getters
		public double getRadius()
		{
			return radius;
		}
		
		public double getArea()
		{
			return (pi * radius * radius);
		}
		
		public double getDiameter()
		{
			return (radius * 2);
		}
		
		public double getCircumference()
		{
			return (2 * pi * radius);
		}

}
