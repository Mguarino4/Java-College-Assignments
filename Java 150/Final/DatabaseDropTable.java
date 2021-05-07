/* #8 Mike & Kat
 * Class: DatabaseDropTable
 * Purpose: This class establishes a connection to the derby Cars database and 
 * Drops the Cars table 
 * This class uses mySQL methods 
 * 11/2019
 */
package Final;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 

public class DatabaseDropTable { 
public static void main(String[] args) { 

	final String CONNECTION = "jdbc:derby:CarsDatabase"; 
try 
(Connection conn = DriverManager.getConnection(CONNECTION); 
Statement statement = conn.createStatement()) { 

	//Drops table Cars
	statement.executeUpdate("drop table CARS");
	
	System.out.println("CARS table dropped.");

}catch (SQLException e) { e.printStackTrace(); }
}}

