/*Michael Guarino
 * This program uses a hashmap to store string values and act as a dictionary to count words in a file
 * it sorts the printout through another sorted hashmap
 * 02/2020
 */
//Sources: stackoverflow.com
package Projects;
import java.util.*;
import java.io.*;
import static java.util.stream.Collectors.*;

public class Word_Count {

    public static void main(String[] args) throws FileNotFoundException, IOException {

    	//Creates the original hashmap to store string entities 
    	Map<String, Integer> dictionary = new HashMap<>();

    	//Reads the content of the text file and uses a string builder
        try (BufferedReader br = new BufferedReader(new FileReader("turing.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            //ADds the words to the hashmap and Creates the counter for the words in the text file
            while (line != null) {
                String[] words = line.split(("\\W+"));   
                for (int i = 0; i < words.length; i++) {
                    if (dictionary.get(words[i].toLowerCase()) == null) {
                        dictionary.put(words[i].toLowerCase(), 1);
                    } else {
                        int newValue = Integer.valueOf(String.valueOf(dictionary.get(words[i].toLowerCase())));
                        newValue++;
                        dictionary.put(words[i].toLowerCase(), newValue);
                    }
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        }
      
        //Sorts the dictionary by count value assigned in hashmap in descending order
        Map<String, Integer> sortedDictionary = dictionary
        		.entrySet()
        		.stream()
        		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        		.collect(
        				toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
        						LinkedHashMap::new));
        
       //for loop to print
       for (Object key : sortedDictionary.keySet()) {
           System.out.println(dictionary.get(key)+" "+ key);
        }
    }}

