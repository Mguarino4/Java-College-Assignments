package Decorator_Pattern;

class Decorator_Tester 
{ 
public static void main(String args[]) 
    { 
        // create new Margherita pizza 
        Pizza pizza = new Margherita(); 
        System.out.println( pizza.getDescription() + "\n Cost : $" + pizza.getCost()); 
  
        // create new StuffedCrust pizza 
        Pizza pizza2 = new StuffedCrust(); 
        // decorate StuffedCrust with Fresh Tomato topping 
        pizza2 = new FreshTomato(pizza2); 
        //decorate StuffedCrust with Bacon topping 
        pizza2 = new Bacon(pizza2); 
        System.out.println( pizza2.getDescription() + "\n Cost : $" + pizza2.getCost()); 
        
        // create new Simple Pizza
        Pizza pizza3 = new SimplePizza();
        // decorate Simple Pizza with Pepperoni topping
        pizza3 = new Pepperoni(pizza3);    
        System.out.println( pizza3.getDescription() + "\n Cost : $" + pizza3.getCost()); 
   } 
}
 