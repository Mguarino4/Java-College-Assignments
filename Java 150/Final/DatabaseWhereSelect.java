/* #4 Mike & Kat
 * Class: DatabaseWhereSelect
 * Purpose: This class establishes a connection to the derby Cars database and 
 * selects all data Where the manufacturer is dodge to be displayed
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

public class DatabaseWhereSelect { 
public static void main(String args[]) { 

final String CONNECTION = "jdbc:derby:CarsDatabase"; 
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
}}