/* #1 Mike & Kat
 * Class: DatabaseCreateTable
 * Purpose: This class establishes a connection to the derby Cars database and makes a Cars table 
 * The table holds the manufacturer, model, color, and production year of a car as well as the state it is registered to and its license plate
 * This class uses mySQL methods 
 * 11/2019
 */
package Final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseCreateTable {
	public static void main(String[] args) {
	
		final String CONNECTION = "jdbc:derby:CarsDatabase;create=true";
	try 
	(Connection conn = DriverManager.getConnection(CONNECTION); 
			Statement statement = conn.createStatement()) { 
			
		//Creates the Cars Table 
		statement.executeUpdate("create table CARS " +
				" (MANUFACTURER VARCHAR(32), " +
				" MODEL VARCHAR(32), " +
				" COLOR VARCHAR(32), " + 
				" PRODUCTION_YEAR INT, " +
				" STATE VARCHAR(32), " +
				" LICENSE_PLATE VARCHAR(32) NOT NULL PRIMARY KEY )"); 
			System.out.println("CARS table created."); } 

catch (SQLException e) { e.printStackTrace(); }
		}}