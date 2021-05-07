/*Michael Guarino
 * Class: Rainfall
 * Purpose: This Class calculates statistics based on the amount of rainfall for a year
 * This class uses Arrays class and Accessor methods as well as a constructor to store and 
 * calculates the Total and Average rainfall as well as the month with highest and lowest rainfall 
 */
package Homework;
import java.util.Arrays;

public class Rainfall {
	
	//creates a private array rain that holds 12 indexes
	private double [] rain = new double [12];
	
	//Creates the array 
	public Rainfall(double [] rainFall)
	{
		rain = new double[rainFall.length];

	    for (int i = 0; i < rainFall.length; i++) 
	        rain[i] = rainFall[i];
	}
	
	//Uses Arrays Class to return the sum of the array
	public double getTotalRainFall()
	{
		return Arrays.stream(rain).sum();
	}
	
	//Uses Arrays Class to return the average the array
	public double getAverageRainFall()
	{
		return Arrays.stream(rain).average().getAsDouble();
	}
	
	// Finds the element with the highest value and returns the element number
	public int getHighestMonth()
	{
		int highest = 0;

		for (int i = 1; i < rain.length; i++) 
		{
			if (rain[i] > rain[highest])
				highest = i;
		}
	    
		return highest;
	}
	
	// Finds the element with the lowest value and returns the element number
	public int getLowestMonth()
	{
		int lowest = 0;

	    for (int i = 1; i < rain.length; i++) 
	    {
	        if (rain[i] < rain[lowest])
	            lowest = i;
	    }
	   
	    return lowest;
	}
	
	
	public double getRainAt(int element)
	{
		return rain[element];
	}

}
