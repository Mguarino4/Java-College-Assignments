/*Michael Guarino
 * Class: RainfallTester
 * Purpose: this is a tester for the Rainfall Class 
 * It initializes a array for rainfall this year and calculates Average/Total rainfall 
 * as well as highest and lowest month using the Rainfall Class 
 */
package Homework;

public class RainfallTester {
	public static void main(String[] args) {
		
		//Creates the array of rainfall for this year
		double[] thisYear = { 2.4, 5.0, 2.8, 6.0, 0.0, 3.2, 3.9, 2.8, 7.9, 0.5, 5.8, 5.4};
		
		//Uses the previous array to make a rainfall object
		Rainfall rainFall = new Rainfall(thisYear);
		
		//Gets the Total rainfall for the year 
		System.out.println("The total rainfall for this year is " + rainFall.getTotalRainFall());
	    
		//Gets the Average rainfall of the year
		System.out.println("The average rainfall for this year is " + rainFall.getAverageRainFall());
	    
		//Returns the # of which month had the Highest rainfall
	    int highest = rainFall.getHighestMonth();
	    System.out.println("The month with the highest amount of rain " + "is " + (highest + 1) + " with " + rainFall.getRainAt(highest) + " inches.");
	    
	    //Returns the # of which month had the Lowest rainfall
	    int lowest = rainFall.getLowestMonth();
	    System.out.println("The month with the lowest amount of rain " + "is " + (lowest + 1) + " with " + rainFall.getRainAt(lowest) + " inches.");

		
		
	}

}
