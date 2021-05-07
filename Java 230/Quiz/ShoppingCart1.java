package Quiz;

public class ShoppingCart1
{
	private int front;
	private int rear;
    private Item[] cart;
    private int itemCount;      // total number of items in the cart
    private int capacity;       // current cart capacity

    // -----------------------------------------------------------
    //  Creates an empty shopping cart with a capacity of 5 items.
    // -----------------------------------------------------------
    public ShoppingCart1()
    {
      front = rear = 0;
      capacity = 5;
      cart = new Item[capacity];
      itemCount = 0;
    }
    // -------------------------------------------------------
    //  Adds an item to the shopping cart.
    // -------------------------------------------------------
    public void add(String itemName, int quantity)
    { 

        Item temp = new Item(itemName, quantity);
        itemCount += quantity;
        cart[itemCount] = temp;
        if(itemCount==capacity)
        {
            increaseSize();
        }
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
            System.out.printf("%s,  ", cart[i]); 
        } 
        System.out.println();
        return; 
    }
    // ---------------------------------------------------------
    //  Increases the capacity of the shopping cart by 3
    // ---------------------------------------------------------
    private void increaseSize()
    {
        Item[] temp = new Item[capacity+3];
        for(int i=0; i < capacity; i++)
        {
            temp[i] = cart[i];
        }
        cart = temp; 
        temp = null;
        capacity = cart.length;
    }
	public class Item
	{
	    private String name;
	    private int quantity;

	    // -------------------------------------------------------
	    //  Create a new item with the given attributes.
	    // -------------------------------------------------------
	    public Item (String itemName, int numPurchased)
	    {
	      name = itemName;
	      quantity = numPurchased;
	    }
	    // -------------------------------------------------
	    //   Returns the name of the item
	    // -------------------------------------------------
	    public String getName()
	    {
	      return name;
	    }
	    // -------------------------------------------------
	    //   Returns the quantity of the item
	    // -------------------------------------------------
	    public int getQuantity()
	    {
	      return quantity;
	    }
	}
	public static void main(String[] args) 
	{ 
		ShoppingCart1 cart = new ShoppingCart1();
		cart.add("chocolate", 2);
		cart.print();
	}
}
