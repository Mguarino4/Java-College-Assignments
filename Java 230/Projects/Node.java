package Projects;

public class Node<T> {
	private T		data;
	private Node 	next;



	public Node(T data) { this(data, null); }
	public Node(T data, Node next) {
		this.data = data;
		this.next = next;
	}

public T get_data()    { return data; }
public Node get_next() { return next; }

	public static void main(String[] args) {
		
		
		Node new_node = new Node("first node data");
		Node next_node = new Node("second node data", new_node);

		System.out.println(next_node.get_data()) 
	}
}

