package Projects;

class LinkedListtest{ 
 Node head;

 static class Node { 
     int data; 
     Node next; 
     Node(int d) 
     { 
         data = d; 
         next = null; 
     } // Constructor 
 } 

 /* This function prints contents of linked list starting from head */
 public void printList() 
 { 
    Node n = head; 
    while (n != null) { 
        System.out.print(n.data + " "); 
        n = n.next; 
     } 
 } 
 
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

public void push(int new_data) 
{ 

    Node new_node = new Node(new_data); 
  
    new_node.next = head; 
  
    head = new_node; 
} 

public static void main(String[] args) 
 { 
     
     LinkedListtest llist = new LinkedListtest(); 

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