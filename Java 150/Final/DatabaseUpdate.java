/* #6 Mike & Kat
 * Class: DatabaseUpdate
 * Purpose: This class establishes a connection to the derby Cars database and 
 * Updates cars that were Model Caravan to Model Hellcat
 * This class uses mySQL methods 
 * 11/2019
 */
package Final;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUpdate{

	public static void main(String[] args) {
		
		final String CONNECTION = "jdbc:derby:CarsDatabase;create=true";
		try (Connection conn = DriverManager.getConnection(CONNECTION); 
				Statement statement = conn.createStatement()) { 
			
			//Update Caravan to Hellcat
			statement.executeUpdate("update Cars set MODEL= 'Hellcat' where MODEL= 'Caravan'");
			
			ResultSet resultset = statement.executeQuery("select MANUFACTURER,MODEL from Cars "); 
			{ 
				while (resultset.next()) { 
					out.print(resultset.getString("MANUFACTURER")); 
					out.print(", "); 
					out.print(resultset.getString("MODEL")); 
					out.println(" ");
				 }
			
			}}catch (SQLException e) { e.printStackTrace(); }
		}}