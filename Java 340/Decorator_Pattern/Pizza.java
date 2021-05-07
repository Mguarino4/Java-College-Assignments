package Decorator_Pattern;

//This is an abstract Pizza class properties have yet to be assigned to it
//Pizza objects hold a description and a price
abstract class Pizza 
{  
    String description = "Unkknown Pizza"; 
  
    public String getDescription() 
    { 
        return description; 
    } 
  
    public abstract int getCost(); 
} 