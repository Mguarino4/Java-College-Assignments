/* #9 Mike & Kat
 * Class: DatabaseTester
 * Purpose: This class Displays a menu and allows for the user to input what they would like to do in the process of making a cars database 
 * They can Create the Cars Table, Add data into the table, Select data from the table, Update data in the table, Delete data from the table, And drop the table.
 * This class uses mySQL methods 
 * 11/2019
 */
package Final;

import static java.lang.System.out;

import java.sql.*;
import java.util.Scanner;

public class DatabaseTester {

	public static void main(String[] args) {
	
		final String CONNECTION = "jdbc:derby:CarsDatabase;create=true";
		
		//Scanner Creates the scanner
		Scanner keyboard = new Scanner(System.in);
				
		//Printouts Asks the user which Medium and how far the wave traveled
		System.out.println("Choose a # : ");
		System.out.println("1 : Create Table");
		System.out.println("2 : Add The Data");
		System.out.println("3 : Select All Data");
		System.out.println("4 : Where Dodge Select");
		System.out.println("5 : Compound Red Dodge Select");
		System.out.println("6 : Update Hellcat Data");
		System.out.println("7 : Delete Volkswagen Data");
		System.out.println("8 : Drop Table");
		
		int inputNumber = keyboard.nextInt();
		
		//Cases Case is made earlier based on user choice
		switch(inputNumber)
		{
		case 1:
			try 
			(Connection conn = DriverManager.getConnection(CONNECTION); 
					Statement statement = conn.createStatement()) { 
					statement.executeUpdate("create table CARS " +
						" (MANUFACTURER VARCHAR(32), " +
						" MODEL VARCHAR(32), " +
						" COLOR VARCHAR(32), " + 
						" PRODUCTION_YEAR INT, " +
						" STATE VARCHAR(32), " +
						" LICENSE_PLATE VARCHAR(32) NOT NULL PRIMARY KEY )"); 
					System.out.println("CARS table created."); } 

		catch (SQLException e) { e.printStackTrace(); }	
			break;
				
		case 2:
			try 
			(Connection conn = DriverManager.getConnection(CONNECTION); 
					Statement statement = conn.createStatement()) { 
				
				statement.executeUpdate("insert into CARS values " + 
						" ('Dodge', 'Ram 3500', 'Grey', 2019, 'NJ', 'N19J8C') ");
				statement.executeUpdate("insert into CARS values " +
						 " ('Volkswagen', 'Jetta', 'Black', 1999, 'NY', 'XCV15J') ");
				statement.executeUpdate("insert into CARS values " +
						 " ('Tesla', 'Model S', 'Black', 2019, 'PA', 'MNJXV7') ");
				statement.executeUpdate("insert into CARS values " +
						 " ('Ford', 'GT', 'Blue', 2019, 'CA', 'MJNJ42') ");
				statement.executeUpdate("insert into CARS values " +
						 " ('Dodge', 'Caravan', 'Red', 2007, 'TX', 'SI4VERT') ");
				
				System.out.println("Rows Added");

			}catch (SQLException e) { e.printStackTrace(); }	
			break;
				
		case 3:
			try 
			(Connection conn = DriverManager.getConnection(CONNECTION); 
				Statement statement = conn.createStatement(); 
				
					//Selects everything in Cars table
					ResultSet resultset = statement.executeQuery("select * from Cars ")) 
			{ 
				while (resultset.next()) { 
					out.print(resultset.getString("MANUFACTURER")); 
					out.print(" "); 
					out.print(resultset.getString("MODEL")); 
					out.print(" ");
					out.print(resultset.getString("COLOR")); 
					out.print(" ");
					out.print(resultset.getInt("PRODUCTION_YEAR")); 
					out.print(" ");
					out.print(resultset.getString("STATE")); 
					out.print(" ");
					out.print(resultset.getString("LICENSE_PLATE")); 
					out.println(" ");
				 }
			}catch (SQLException e) { e.printStackTrace(); }	
			break;
			
		case 4:
			try (Connection conn = DriverManager.getConnection(CONNECTION); 
					Statement statement = conn.createStatement(); 
					
						//Selects all cars that are Dodges 
						ResultSet resultset = statement.executeQuery("select * from Cars where MANUFACTURER= 'Dodge' ")) 
				{ 
					while (resultset.next()) { 
						out.print(resultset.getString("MANUFACTURER")); 
						out.print(", "); 
						out.print(resultset.getString("MODEL")); 
						out.print(", ");
						out.print(resultset.getString("COLOR")); 
						out.print(", ");  
						out.print(resultset.getInt("PRODUCTION_YEAR"));
						out.print(", ");
						out.print(resultset.getString("STATE")); 
						out.print(", ");
						out.print(resultset.getString("LICENSE_PLATE")); 
						out.println(" ");  }


				}catch (SQLException e) { e.printStackTrace(); }
			break;
		case 5:
			try (Connection conn = DriverManager.getConnection(CONNECTION); 
					Statement statement = conn.createStatement(); 
					
						//Selects all cars that are Red Dodges
						ResultSet resultset = statement.executeQuery("select * from Cars where MANUFACTURER= 'Dodge' AND COLOR= 'Red' ")) 
				{ 
					while (resultset.next()) { 
						out.print(resultset.getString("MANUFACTURER")); 
						out.print(", "); 
						out.print(resultset.getString("MODEL")); 
						out.print(", ");
						out.print(resultset.getString("COLOR")); 
						out.print(", ");  
						out.print(resultset.getInt("PRODUCTION_YEAR"));
						out.print(", ");
						out.print(resultset.getString("STATE")); 
						out.print(", ");
						out.print(resultset.getString("LICENSE_PLATE")); 
						out.println(" ");  }


				}catch (SQLException e) { e.printStackTrace(); }
			break;
		case 6:
			try (Connection conn = DriverManager.getConnection(CONNECTION); 
					Statement statement = conn.createStatement()) { 
				
				//Updates the Caravan to a Hellcat
				statement.executeUpdate("update Cars set MODEL= 'Hellcat' where MODEL= 'Caravan'");
				
				ResultSet resultset = statement.executeQuery("select * from Cars "); 
				{ 
					while (resultset.next()) { 
						out.print(resultset.getString("MANUFACTURER")); 
						out.print(" "); 
						out.print(resultset.getString("MODEL")); 
						out.print(" ");
						out.print(resultset.getString("COLOR")); 
						out.print(" ");
						out.print(resultset.getInt("PRODUCTION_YEAR")); 
						out.print(" ");
						out.print(resultset.getString("STATE")); 
						out.print(" ");
						out.print(resultset.getString("LICENSE_PLATE")); 
						out.println(" ");
					 }
				
				}}catch (SQLException e) { e.printStackTrace(); }	
			break;
			
		case 7:
			try (Connection conn = DriverManager.getConnection(CONNECTION); 
					Statement statement = conn.createStatement()) { 
				
				statement.executeUpdate("DELETE FROM Cars where MANUFACTURER= 'Volkswagen'");
				ResultSet resultset = statement.executeQuery("select * from Cars "); 
				{ 
					while (resultset.next()) { 
						out.print(resultset.getString("MANUFACTURER")); 
						out.print(" "); 
						out.print(resultset.getString("MODEL")); 
						out.print(" ");
						out.print(resultset.getString("COLOR")); 
						out.print(" ");
						out.print(resultset.getInt("PRODUCTION_YEAR")); 
						out.print(" ");
						out.print(resultset.getString("STATE")); 
						out.print(" ");
						out.print(resultset.getString("LICENSE_PLATE")); 
						out.println(" ");
					 }
				}}catch (SQLException e) { e.printStackTrace(); }	
			break;
			
		case 8:
			try 
			(Connection conn = DriverManager.getConnection(CONNECTION); 
			Statement statement = conn.createStatement()) { 

			statement.executeUpdate("drop table CARS");
			System.out.println("CARS table dropped.");

			}catch (SQLException e) { e.printStackTrace(); }	
			break;
					
				}
				
				//Closes the Scanner Object
				keyboard.close();


	}

}
