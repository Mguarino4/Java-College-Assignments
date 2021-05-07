// Mikey Guarino 3/20
//This Linked list class contains Node Class
//IT has methods to print a linked list, delete an element of a linked list, and insert a new element as the head node
package Projects;

public class LinkedList{ 
Node head;
 
/* This is the node class */
static class Node 
{ 
  int data; 
  Node next; 
  Node(int d) 
{ 
  data = d; 
  next = null; 
} 
} 

/* This function prints contents of linked list starting from head */
public void printList() 
{ 
   Node n = head; 
   while (n != null) 
   { 
       System.out.print(n.data + " "); 
       n = n.next; 
   } 
} 

/* This function deletes contents of linked list by key */
public void deleteNode(int key) 
{ 
    Node temp = head, prev = null; 

    if (temp != null && temp.data == key) 
    { 
        head = temp.next; 
        return; 
    } 

    while (temp != null && temp.data != key) 
    { 
        prev = temp; 
        temp = temp.next; 
    }     

     
    if (temp == null) return; 

    
    prev.next = temp.next; 
}

/* This function inserts contents of linked list as the head node */
public void push(int new_data) 
{ 

  Node new_node = new Node(new_data); 
  new_node.next = head; 
  head = new_node; 
} 

public static void main(String[] args) 
{ 
    
    LinkedList llist = new LinkedList(); 

    llist.head = new Node(1); 
    Node second = new Node(2); 
    Node third = new Node(3);
    Node fourth = new Node(4);

    llist.head.next = second;
    second.next = third;
    third.next = fourth;
    System.out.println("Beginning Linked List");
    llist.printList(); 
    
    llist.deleteNode(3); 
    System.out.println("\nLinked List after Deletion"); 
    llist.printList(); 
    
    llist.push(7);
    System.out.println("\nLinked List after Insertion");
    llist.printList(); 
    
} 
}

