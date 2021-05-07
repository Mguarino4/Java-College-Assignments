//Mike Guarino 09/2020
//This is the items class which holds the data of the below private variables for each disk item created
//This class has setters and getters to access the private variables and is the parent class to CD.java and DVD.java

package Test;

public class Item{
	
	//Variables	
	private String comment;
	private boolean gotIt;
	private int playingTime;
	private String title;
	
	//Constructor
	public Item(String title, int playingTime)
	{
		this.title = title;
		this.playingTime =playingTime;
	}

	//Setters
	public void setComment(String comment)
	{
		this.comment = comment;
	}
	
	public void setOwn(boolean gotIt)
	{
		this.gotIt = gotIt;
	}
	
	//Getters
	public String getComment()
	{
		return comment;
	}
	
	public boolean getOwn()
	{
		return gotIt;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getPlayingTime() {
		return playingTime;
	}
	
	//To-String
	public String toString()
	{
		return   getTitle() +  " (" + getPlayingTime() +" mins)" + "\n" ;
		
	}	
	
	//Matcher
	//Overl0ads with the Search method 
	//allows object to be checked according to their respective fields
	public boolean matches(Object searchObject) {
		String searchTermLowerCase = searchObject.toString().toLowerCase();
		if (this.getTitle().toLowerCase().contains(searchTermLowerCase))
			return true;
		
		else return false;
		
	}
}
