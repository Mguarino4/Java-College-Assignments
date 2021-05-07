package Projects;
import java.util.regex.*;
import java.util.regex.Matcher; 
	  
public class matcher1 { 
	    public static void main(String[] args) 
	    { 
	  
	        // Get the regex to be checked 
	        String regex = "()"; 
	  
	        // Create a pattern from regex 
	        Pattern pattern 
	            = Pattern.compile(regex); 
	  
	        // Get the String to be matched 
	        String stringToBeMatched 
	            = "( ( a "; 
	  
	        // Create a matcher for the input String 
	        Matcher matcher 
	            = pattern 
	                  .matcher(stringToBeMatched); 
	  
	        // Get the subsequence 
	        // using find() method 
	        System.out.println(matcher.find()); 
	    } 
	} 


