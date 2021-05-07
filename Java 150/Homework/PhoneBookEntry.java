/*Michael Guarino
 * Class: PhoneBookEntry
 * Purpose: This Class creates a PhoneBookEntry that stores a Name adn a Phone Number
 * This classes uses accessor and mutator methods to store the data  
 */
package Homework;

public class PhoneBookEntry {
	
	//Private Variables
	private String name;
	private String phoneNumber;
	
	//Constructor
	public PhoneBookEntry(String name, String phoneNumber) 
	{
		this.name=name;
		this.phoneNumber=phoneNumber;
	}

	//Setters
	public void setName(String name) 
	{
		this.name = name;
	}

	public void setNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	
	//Getters
	public String getName() 
	{
		return name;
	}
	
	public String getNumber() 
	{
		return phoneNumber;
	}

}
