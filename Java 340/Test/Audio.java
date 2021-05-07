//Mike Guarino 09/2020
//This class is a subclass to Item.java and holds the data that is unique to CD disk items
//This class has setters and getters to access the private variables
//This class uses Enums for Audio type from Type.java

package Test;

public class Audio extends Item{
	
	//Variables
	private String artist;
	private int numberOfTracks;
	private String type;
	
	
	//Constructor
	public Audio(String title, String artist, int numberOfTracks, int playingTime, Type item)
	{
		super(title, playingTime);
		this.artist = artist;
		this.numberOfTracks = numberOfTracks;
		this.type = item.toString();
	}
	
	//Getters
	public String getArtist()
	{
		return artist;
	}
	
	public int getNumberOfTracks()
	{
		return numberOfTracks;
	}
	public String getType()
	{
		return type+": ";
	}
	
	//To-String
	@Override
	public String toString()
	{
		return getType() + getTitle() +  " (" + 
				getPlayingTime() +" mins)" + "\n" + "    " + getArtist() + "\n" + "    " 
				+ "# of tracks : " + getNumberOfTracks() + "\n";
	}
	
	//Matcher
	//Overl0ads with the Search method 
	//allows object to be checked according to their respective fields
	public boolean matches(Object searchObject) {
		String searchTermLowerCase = searchObject.toString().toLowerCase();
		if (this.getArtist().toLowerCase().contains(searchTermLowerCase))
			return true;
		if (this.getType().toLowerCase().contains(searchTermLowerCase))
			return true;
		return super.matches(searchObject);
		}
}