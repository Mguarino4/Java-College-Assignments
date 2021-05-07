//Mike Guarino 09/2020
//This class is a tester class for Item.Java, CD.Java, and DVD.Java and Database.Java
//This class uses a private Linked List to act as a database
//This class uses a constructor to store "Items" from the Item.java class and its children in the LinkedList
//This class uses the toString methods in each class to process the output 

package Test;
import java.util.*;

public class Database {
	
	private List<Item> items;
	
	public Database()
	{
		items = new LinkedList<Item>();
	}
	
	
	public void addItem(Item newItem)
	{
		items.add(newItem);
	}
	
	public void list()
	{
		System.out.println("Listing:");
		Iterator<Item> iterator=items.iterator();
	     while(iterator.hasNext())
	     {
	       System.out.println(iterator.next());
	     }
	} 
	
	//Search method searches through Items in Database
	//With searchObject as parameter prints any matching results
	  public void search(Object searchObject) {
		  for (Item i : this.items) {
			  if(i.matches(searchObject))
				  System.out.print(i + "\n");
		  }
	  }
	     							

	
	public static void main(String[] args) {
		Database db = new Database();
		Audio c = new Audio("A Swingin' Affair'", "Frank Sinatra", 16, 64, Type.CD);
		Audio d = new Audio("Big Bad World", "PLain White T's", 10, 35, Type.Vinyl);
		Video x = new Video("O Brother, Where Art Thou?", "Joel & Ethan Coen", 106, Type.BLUERAY);
		Video v = new Video("O Brother, Where Art Thou?", "Joel & Ethan Coen", 106, Type.DVD);
		Video y = new Video("Infinity Wars", "Anthony & Joe Russo", 149, Type.BLUERAY);
		Video z = new Video("Infinity Wars", "Anthony & Joe Russo", 149, Type.VHS);
		
		
		db.addItem(c);
		db.addItem(d);
		db.addItem(x);
		db.addItem(v);
		db.addItem(y);
		db.addItem(z);
		
		db.list();
		
		System.out.println("Searching :");
		db.search("O Brother");
	    db.search(Type.BLUERAY);
	    db.search(Type.Vinyl);
	    
	}
}

/*public void search(Object key)
{	
	System.out.println("Searching for " + key +":");
	Iterator<Item> iterator = items.iterator();
	while (iterator.hasNext() ) {
		Object element = iterator.next(); 
		if (element.toString()
				.contains
				(key.toString())) 
    	 {
			System.out.print(element + " \n");
         }}}
*/
  