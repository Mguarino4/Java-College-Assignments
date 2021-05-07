package Homework;

public class LandCalculation {

	public static void main(String[] args) {
		
		//Sets the area of the Tract and the area within an acre
		int acre = 43560;
		int tractArea = 389767;
		
		//Divides how many acres are in the Tract 
		int Plot = tractArea/acre;
		
		//Prints out the result
		System.out.println("There are "+Plot+" acres in the tract" );
			
		
	}
}
