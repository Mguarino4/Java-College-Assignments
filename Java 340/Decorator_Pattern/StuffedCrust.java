package Decorator_Pattern;

//This class creates a stuffed crust pizza object that can later have toppings added to it via the decorator
class StuffedCrust extends Pizza 
{ 
    public StuffedCrust() 
    {  
    	description = "StuffedCrust Pizza"; 
    } 
    public int getCost() 
    { 
    	return 11; 
    } 
} 