package Quiz;

public class queueLinkedList{
	private Node front, rear; 
	private int currentSize; // number of items
 
 //class to define linked node
 private class Node
 { 
	 int data;
	 Node next;
 }
 
 //Zero argument constructor
 public queueLinkedList()
 {
	 front = null;
	 rear = null;
	 currentSize = 0;
 }
 
 public boolean isEmpty()
 {
	 return (currentSize == 0);
 }
 
 //Remove item from the beginning of the list.
 public int dequeue()
 {
	 int data = front.data;
	 front = front.next;
	 if (isEmpty()) 
 {
		 rear = null;
 }
	 currentSize--;
	 System.out.println(data+ " removed from the queue");
	 return data;
 }
 
 //Add data to the end of the list.
 public void enqueue(int data)
 {
	 Node oldRear = rear;
	 rear = new Node();
	 rear.data = data;
	 rear.next = null;
	 if (isEmpty()) 
 {
		 front = rear;
 }
	 else 
 {
		 oldRear.next = rear;
 }
	 currentSize++;
	 System.out.println(data+ " added to the queue");
 }

 public void printQueue() {
	 Node n = front;
	 while(n != null)
	 {
		 System.out.print(n.data + " ");
		 n= n.next;
	 }
	 System.out.println();
 }
 
 public boolean searchQueue(Node first, int key) {
	 Node current = first;
	 while(current != null)
	 {
		 if (current.data == key)
			 return true;
		 current = current.next;
	 }
	 return false;
 }

 public int read()
 {
	 if(!isEmpty()) {
		 return rear.data;
	 }
	 else { 
         System.out.println("Queue is empty"); 
         return -1; 
     } 
 }
 public static void main(String a[]){
 
 queueLinkedList queue = new queueLinkedList();
 queue.enqueue(6);
 queue.dequeue();
 queue.enqueue(3);
 System.out.printf("Top element is %d\n", queue.read());
 queue.enqueue(99);
 queue.enqueue(56);
 System.out.printf("Top element is %d\n", queue.read());
 queue.dequeue();
 queue.enqueue(43);
 queue.dequeue();
 queue.enqueue(89);
 queue.enqueue(77);
 queue.dequeue();
 queue.enqueue(32);
 queue.enqueue(232);
 queue.printQueue();
 if (queue.searchQueue(queue.front, 32)) 
     System.out.println("Yes"); 
 else
     System.out.println("No");
 if (queue.searchQueue(queue.front, 22)) 
     System.out.println("Yes"); 
 else
     System.out.println("No");
 System.out.printf("Top element is %d\n", queue.read());

 }
}
 