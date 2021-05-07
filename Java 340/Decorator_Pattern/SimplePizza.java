package Decorator_Pattern;

//This class creates a simple pizza object that can later have toppings added to it via the decorator
class SimplePizza extends Pizza 
{ 
	public SimplePizza() 
	{ 
		description = "Simple Pizza"; 
	} 
	
	public int getCost() 
	{  
		return 10;  
	} 
} 
  