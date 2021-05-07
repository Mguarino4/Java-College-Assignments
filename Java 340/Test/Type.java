//Mike Guarino 10/2020
//This is the Type.java Enums class for video.java
//It holds three different types for video objects : DVD, Blueray, VHS
//And Three types for auido objects : CD, Casette, Vinyl

package Test;

public enum Type {
	
	//Video Media Types
	DVD, BLUERAY, VHS, Digital,
	
	//Audio MediaTypes
	CD, Casette, Vinyl;
	
	public String toString() {
		switch(this) {
			//Video
			case DVD: return "DVD";
			case BLUERAY: return "Blueray";
			case VHS: return "VHS";
			case Digital: return "Digital";			
			
			//Audio
			case CD: return "CD";
			case Casette: return "Casette";
			case Vinyl: return "Vinyl";
		}
		return toString();	
	}
}