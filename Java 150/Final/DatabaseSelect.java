/* #3 Mike & Kat
 * Class: DatabaseSelect
 * Purpose: This class establishes a connection to the derby Cars database and selects data to be displayed
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

public class DatabaseSelect { 
	public static void main(String args[]) { 

final String CONNECTION = "jdbc:derby:CarsDatabase"; 
try 
(Connection conn = DriverManager.getConnection(CONNECTION); 
	Statement statement = conn.createStatement(); 
	
		//Select to display Manufacturer and Model
		ResultSet resultset = statement.executeQuery("select MANUFACTURER,MODEL from Cars ")) 
{ 
	while (resultset.next()) { 
		out.print(resultset.getString("MANUFACTURER")); 
		out.print(", "); 
		out.print(resultset.getString("MODEL")); 
		out.println(" ");
	 }
	
	//Select to display Manufacturer, Model, and Year
	ResultSet resultset1 = statement.executeQuery("select MANUFACTURER,MODEL,STATE from Cars ");
	{ 
		while (resultset1.next()) { 
			out.print(resultset1.getString("MANUFACTURER")); 
			out.print(", "); 
			out.print(resultset1.getString("MODEL")); 
			out.print(", ");
			out.print(resultset1.getString("STATE")); 
			out.println(" ");  
		 }


	}}catch (SQLException e) { e.printStackTrace(); }
}}