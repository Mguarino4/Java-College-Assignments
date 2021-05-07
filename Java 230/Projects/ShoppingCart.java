package Projects;

public class ShoppingCart {
	private int front, rear, capacity;
    private String cart[]; 
  
    public ShoppingCart(int c) 
    { 
        front = rear = 0; 
        capacity = c; 
        cart = new String[capacity]; 
    } 

	public void add(String product, int amount) 
    { 
		// check queue is full or not 
        if (capacity == rear) { 
            System.out.printf("\nQueue is full\n"); 
            return; 
        } 
  
        // insert element at the rear 
        else { 
 
        while( amount > 0) {
            cart[rear] = product; 
            rear++;  
            amount --;
        }
        }
       return; 
    } 
    
    public void print() 
    { 
        int i; 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
  
        // traverse front to rear and print elements 
        for (i = front; i < rear; i++) { 
            System.out.printf("%s, ", cart[i]); 
        } 
        System.out.println();
        return; 
    }

public static void main(String[] args) 
{ 
	ShoppingCart cart1 = new ShoppingCart(10);
	cart1.add("chocolate", 2);
	cart1.add("sandwich", 1);
	cart1.print();
	cart1.add("eggs", 5);
	cart1.print();

}
}