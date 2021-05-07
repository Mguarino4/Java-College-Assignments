/* #2 Mike & Kat
 * Class: DatabaseInsertData
 * Purpose: This class establishes a connection to the derby Cars database and adds data into the Cars table previously created
 * This class uses mySQL methods 
 * 11/2019
 */
package Final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInsertData{
	public static void main(String[] args) {
		
		final String CONNECTION = "jdbc:derby:CarsDatabase;create=true";
		try 
		(Connection conn = DriverManager.getConnection(CONNECTION); 
				Statement statement = conn.createStatement()) { 
			
			
			//Statements that insert the data into the table
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
		}}