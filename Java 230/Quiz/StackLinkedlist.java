package Quiz;

import static java.lang.System.exit; 

//Create Stack Using Linked list 
public class StackLinkedlist { 

 // A linked list node 
 private class Node { 

     int data; // integer data 
     Node link; // reference variable Node type 
 } 
 // create global top reference variable global 
 Node top; 
 // Constructor 
 StackLinkedlist() 
 { 
     this.top = null; 
 } 

 // Utility function to add an element x in the stack 
 public void pushStack(int x) // insert at the beginning 
 { 
     // create new node temp and allocate memory 
     Node temp = new Node(); 

     // initialize data into temp data field 
     temp.data = x; 

     // put top reference into temp link 
     temp.link = top; 

     // update top reference 
     top = temp; 
 } 

 // Utility function to check if the stack is empty or not 
 public boolean isEmpty() 
 { 
     return top == null; 
 } 

 // Utility function to return top element in a stack 
 public int read() 
 { 
     // check for empty stack 
     if (!isEmpty()) { 
         return top.data; 
     } 
     else { 
         System.out.println("Stack is empty"); 
         return -1; 
     } 
 } 

 // Utility function to pop top element from the stack 
 public void popStack() // remove at the beginning 
 { 
     // check for stack underflow 
     if (top == null) { 
         System.out.print("\nStack Underflow"); 
         return; 
     } 

     // update the top pointer to point to the next node 
     top = (top).link; 
 } 

 public void printStack() 
 { 
     // check for stack underflow 
     if (top == null) { 
         System.out.printf("\nStack Underflow"); 
         exit(1); 
     } 
     else { 
         Node temp = top; 
         while (temp != null) { 

             // print node data 
             System.out.printf("%d->", temp.data); 

             // assign temp link to temp 
             temp = temp.link; 
         } 
     } 
 } 

 public boolean search(Node head, int key) 
 { 
     Node current = head;    //Initialize current 
     while (current != null) 
     { 
         if (current.data == key) 
             return true;    //data found 
         current = current.link; 
     } 
     return false;    //data not found 
 }
//main class 
 
 public static void main(String[] args) 
 { 
     // create Object of Implementing class 
     StackLinkedlist ll = new StackLinkedlist(); 
     // insert Stack value 
     ll.pushStack(11); 
     ll.pushStack(22); 
     ll.pushStack(33); 
     ll.pushStack(44); 

     // print Stack elements 
     ll.printStack(); 

     // print Top element of Stack 
     System.out.printf("\nTop element is %d\n", ll.read()); 

     // Delete top element of Stack 
     ll.popStack(); 
     ll.popStack(); 

     // print Stack elements 
     ll.printStack(); 

     // print Top element of Stack 
     System.out.printf("\nTop element is %d\n", ll.read()); 
     
     if (ll.search(ll.top, 22)) 
         System.out.println("Yes"); 
     else
         System.out.println("No");
     
 } 
} 


