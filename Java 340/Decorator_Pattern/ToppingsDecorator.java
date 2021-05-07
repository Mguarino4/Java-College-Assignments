package Decorator_Pattern;

/*This is the decorator
 *This is an abstract topping class properties have yet to be assigned to it 
 *Properties assigned by the decorator will update the existing pizza objects 
  description and cost to accurately account for toppings added 
*/
abstract class ToppingsDecorator extends Pizza 
{ 
    public abstract String getDescription(); 
} 
  
