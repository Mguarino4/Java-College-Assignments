//Sources: stackoverflow.com
package Projects;
import java.util.*;
import java.io.*;
import static java.util.stream.Collectors.*;

public class Project1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

    	//Creates the original hashmap
    	Map<String, Integer> dictionary = new HashMap<>();

    	//Reads the content of the text file
        try (BufferedReader br = new BufferedReader(new FileReader("turing.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            //Creates the counter for the words in the text file
            while (line != null) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (dictionary.get(words[i]) == null) {
                        dictionary.put(words[i], 1);
                    } else {
                        int newValue = Integer.valueOf(String.valueOf(dictionary.get(words[i])));
                        newValue++;
                        dictionary.put(words[i], newValue);
                    }
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        }
      
        //Sorts the dictionary by value assigned in hashmap descending order
        Map<String, Integer> sortedDictionary = dictionary
        		.entrySet()
        		.stream()
        		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        		.collect(
        				toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
        						LinkedHashMap::new));
        
        //System.out.println("map after sorting by values in descending order: " + sortedDictionary);
        
       //for loop to print
       for (Object key : sortedDictionary.keySet()) {
           System.out.println("Word: " + key +" : "+"Counts: " + dictionary.get(key));
        }
    

		  //Open Scanner
	       Scanner scanner = new Scanner(new File("turing.txt"));

	       int[] count = new int[26];{

	        while (scanner.hasNextLine()) {
	            String answer = scanner.nextLine();
	            answer = answer.toLowerCase();
	            char[] characters = answer.toCharArray();
	            /// change here!
	            for (int i = 0; i< characters.length ; i++) {
	                if((characters[i] >='a') && (characters[i]<='z')) {
	                     count[characters[i] -'a' ]++;
	                }
	            }   
	        }
	        
	        //Close Scanner
	        scanner.close();
	        
	        //Prints out count of characters
	        for (int i = 0; i < 26; i++) {
	            System.out.print((char) (i + 'a'));
	            System.out.println(": " + count[i]);
	        }
	    }}}
	

