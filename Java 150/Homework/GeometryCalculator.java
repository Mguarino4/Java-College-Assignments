/*Michael Guarino
 * Class: GeometryCalculator
 * Purpose: This Class calculates the area of either: Circles with a given radius,
 * Rectangles with a given width and length, and Triangles with a given base and height 
 */
package Homework;

public class GeometryCalculator {
	
	//Static Variables
	static double radius;
	static double width;
	static double length;
	static double base;
	static double height;
	
	//Static Methods
	public static double circleArea()
	{
		return (Math.PI * radius * radius);
	}
	
	public static double rectangleArea()
	{
		return (width * length);
	}
	
	public static double triangleArea()
	{
	
		return (base * height * 0.5);
	}

}
