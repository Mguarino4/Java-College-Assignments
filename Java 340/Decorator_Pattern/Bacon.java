package Decorator_Pattern;

//This class adds bacon to a pizza object via the decorator
class Bacon extends ToppingsDecorator 
{ 
    Pizza pizza; 
    
    public Bacon(Pizza pizza)
    {  
    	this.pizza = pizza; 
    } 
    
    public String getDescription() 
    { 
        return pizza.getDescription() + ", add Bacon "; 
    } 
    
    public int getCost()  
    {  
    	return 4 + pizza.getCost(); 
    } 
} 
