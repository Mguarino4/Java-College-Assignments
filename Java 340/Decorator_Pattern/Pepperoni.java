package Decorator_Pattern;

//This class adds pepperoni to a pizza object via the decorator
class Pepperoni extends ToppingsDecorator 
{ 
    Pizza pizza; 
    
    public Pepperoni(Pizza pizza) 
    {  
    	this.pizza = pizza;  
    } 
    public String getDescription() 
    { 
        return pizza.getDescription() + ", add Pepperoni"; 
    } 
    
    public int getCost() 
    { 
    	return 4 + pizza.getCost(); 
    } 
} 