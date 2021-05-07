package Decorator_Pattern;

//This class creates a margherita pizza object that can later have toppings added to it via the decorator
class Margherita extends Pizza 
{ 
    public Margherita()  
    { 
    	description = "Margherita Pizza"; 
    } 
    
    public int getCost() 
    { 
    	return 12;  
    } 
} 
