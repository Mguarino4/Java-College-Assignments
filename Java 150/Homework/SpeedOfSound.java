/*Michael Guarino
 * Class: SpeedOfSound
 * Purpose: This Class calculates the time it takes for a sound wave to travel through a chosen medium 
 * This class uses Accessor and mutator methods as well as a constructor to store and calculate the distance and time 
 */
package Homework;

public class SpeedOfSound {
	
	//Defines the private variable Distance
	private double distance;
	
	//Constructor
	public SpeedOfSound(double distance) 
	{
		this.distance = distance;
	}
	
	//These are the Setters or Mutators
	public void setDistance(double distance)
	{
		this.distance = distance;
	}
	
	//These are the Getters or Accessors 
	public double getSpeedInAir()
	{
		return (distance / 1100);
	}
	public double getSpeedInWater()
	{
		return (distance / 4900);
	}
	public double getSpeedInSteel()
	{
		return (distance / 16400);
	}

}
