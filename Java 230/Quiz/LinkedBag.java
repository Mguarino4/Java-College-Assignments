package Quiz;

public class LinkedBag{
    private Node first;    // beginning of bag
    private int n;

 // linked list class
    private class Node {
        private int item;
        private Node next;
    }
    
    public LinkedBag() {
        first = null;
        n = 0;
    }
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public int size() {
        return n;
    }
    
    public void insert(int item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }
    
    public int read()
    {
    	if (!isEmpty()) {
    		return first.item;
    	}
    	else {
    		System.out.println("Bag is empty"); 
            return -1;
    	}
    }
    
    public void display()
    {
    	Node temp = first;
    	while (temp != null) {
    		System.out.printf("%d ", temp.item); 

            // assign temp link to temp 
            temp = temp.next;
    	}
    	System.out.println();
    }
    
    public boolean search(Node first, int key)
    {
    	Node current = first;
    	 while (current != null) 
         { 
             if (current.item == key) 
                 return true;    //data found 
             current = current.next; 
         } 
         return false;    //data not found 
     }
    
    public int remove() {
    	
    	int data = first.item;
   	 	first = first.next;
   	 	
   	 	return data;
    }
    
//Main
public static void main(String[] args) 
{ 
	LinkedBag bag = new LinkedBag();
	
	System.out.println(bag.isEmpty());
	bag.insert(4);
	bag.insert(5);
	bag.insert(7);
	bag.display();
	System.out.println(bag.search(bag.first, 7));
	System.out.println(bag.isEmpty());
	System.out.println(bag.remove());
	bag.display();
	System.out.println(bag.isEmpty());
	
}
}

