/*Mikey Guarino
*This program counts all the characters in a text file and returns 
*how many times each character was used in that file in lowercase 
*02/2020
*Sources: stackoverflow.com
*/
package Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Char_Count {
	  public static void main(String[] args) throws FileNotFoundException {

		  //Opens Scanner to scan the file 
	       Scanner scanner = new Scanner(new File("turing.txt"));
	       
	       //Creates an Array to count 
	       int[] count = new int[26];
	       
	       //Scanner reads through file and makes sure that all characters are lowercase
	        while (scanner.hasNextLine()) {
	            String answer = scanner.nextLine();
	            answer = answer.toLowerCase();
	            
	            //creates the Array of characters
	            char[] characters = answer.toCharArray();
	         
	            //Loop that adds to the count array for each charter count 
	            for (int i = 0; i< characters.length ; i++) {
	                if((characters[i] >='a') && (characters[i]<='z')) {
	                     count[characters[i] -'a' ]++;
	                }
	            }   
	        }
	        
	        //Closes the Scanner
	        scanner.close();
	        
	        //for loop that prints out the characters and their respective counts
	        for (int i = 0; i < 26; i++) {
	            System.out.print((char) (i + 'a'));
	            System.out.println(": " + count[i]);
	        }
	    }
	}