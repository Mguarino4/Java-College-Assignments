//Mike Guarino 09/2020
//This class is a subclass to Item.java and holds the data that is unique to Video items
//This class has setters and getters to access the private variables
//This class uses Enums for video type from Type.java

package Test;

public class Video extends Item {
	
	//Variables
	private String director;
	private String type;
		
		//Constructor
		public Video(String title, String director, int playingTime, Type item)
		{
			super(title, playingTime);
			this.director = director;
			this.type = item.toString();
		}
		
		//Getters
		public String getDirector()
		{
			return director;
		}
		
		public String getType()
		{
			return type+": ";
		}
		//To-String
		@Override
		public String toString()
		{
			return getType() + getTitle() +  " (" + getPlayingTime() +" mins)" + "     "+getDirector() +"\n";
		}
		
		//Matcher
		//Overl0ads with the Search method 
		//allows object to be checked according to their respective fields
		public boolean matches(Object searchObject) {
			String searchTermLowerCase = searchObject.toString().toLowerCase();
			if (this.getDirector().toLowerCase().contains(searchTermLowerCase))
				return true;
			if (this.getType().toLowerCase().contains(searchTermLowerCase))
				return true;
			return super.matches(searchObject);
			
		}
}
	


