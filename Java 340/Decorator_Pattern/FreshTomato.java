package Decorator_Pattern;

//This class adds fresh tomato to a pizza object via the decorator
class FreshTomato extends ToppingsDecorator 
{ 
    Pizza pizza; 
  
    public FreshTomato(Pizza pizza) 
    { 
    	this.pizza = pizza; 
    } 
    
    public String getDescription() 
    { 
        return pizza.getDescription() + ", add Fresh Tomato"; 
    } 
    
    public int getCost() 
    { 
    	return 3 + pizza.getCost(); 
    } 
} 
