/*Michael Guarino
 * Class: PhoneBookTester
 * Purpose: This Class is a tester for the PhoneBookEntry class
 * This classes uses ArrayList class as well as the methods from PhoneBookEntry to create a list of PhoneBookEntries
 * This class uses a for loop to display the phone book entries  
 */
package Homework;
import java.util.*;
public class PhoneBookTester {

	public static void main(String[] args) {
		
		//Creates the List using the Constructor as the field
		List<PhoneBookEntry> phoneBook = new ArrayList<PhoneBookEntry>();
		
		//Adds the data into the list
		phoneBook.add(new PhoneBookEntry("Mikey Guarino","908.555.4312"));
		phoneBook.add(new PhoneBookEntry("Marco Guarino","850.111.5789"));
		phoneBook.add(new PhoneBookEntry("John Locke","908.777.1234"));
		phoneBook.add(new PhoneBookEntry("John Doe","973.444.4321"));
		phoneBook.add(new PhoneBookEntry("Jane Doe","973.444.4321"));
		
		//For Loop to display list
		for (PhoneBookEntry entry : phoneBook) 
		{
			System.out.println("Name: " + entry.getName() + ", Phone Number: " + entry.getNumber());

		}

}}
