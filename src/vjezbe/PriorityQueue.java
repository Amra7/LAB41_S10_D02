package vjezbe;

public class PriorityQueue {

	private Node head;
	private Node tail;
	
	public PriorityQueue(){
		this.head = null;
		this.tail = null;
	}
	

	public void push(int value, int priority){
		Node newNode= new Node(value, priority );
		
		if (head == null){
			head = newNode;
			tail = head;
			return;
		}
		if( head.priority < newNode.priority){
			newNode.next = head;
			head = newNode;
			return;
			
		} else if( head.priority >= newNode.priority) {
			Node current = head.next;
			Node prev = head;
			while ( current !=  null ){
						
				 if (current.priority <= newNode.priority ) {
					prev.next = newNode;
					newNode.next = current;
					return;
				}
				prev = current;
				current = current.next;
			}
			
			tail.next = newNode;
			tail = tail.next;
		}
			
	}
	
	public int pop (){
		if( head == null){
			throw new NullPointerException("Stack is empty");
		}
		if ( head == tail ){
			Node current = head;
			int valueNode = current.value;
			head = tail = null;
			return valueNode;			
		}
		
		Node current = head;
		int valueNode = current.value;
		head = current.next;
		current = null;
		
		return valueNode;
	}
	
	/**
	 * Peeks value of first element we pushed.
	 * @return value of first element.
	 */
	public int peek(){
		if (head == null){
			throw new NullPointerException("Stuck is Empty");
		}	
			Node current = head;
			int valueNode = current.value;
			return valueNode;	
	}
	
	/**
	 * Get Size
	 * @return size of linked list with Priority.
	 */
	public int getSize(){
		if ( head == null){
			return 0;
		}
		return getSize(head, 0);
	}
		
	private int getSize(Node current, int count) {
		if ( current == null)
			return count;
		return getSize( current = current.next, count +1);
	}
	
	/**
	 * Contains  value.
	 * @param value - value that we forwarding.
	 * @return true if it contains value or false if it does not.
	 */
	public boolean contains(int value){
		if ( head.value == value){
			return true;
		}
		return contains( head,value);
	}

	private boolean contains(Node current, int value) {
		if( current == null){
			return false;
		}		
		if( current.value == value){
			return true;
		}				
		return contains(current.next, value);
	}
	
	/**
	 * Checks if Linked List is empty
	 * @return true if it is empty or false if has contains.
	 */
	public boolean isEmpty(){
		if (head == null)
			return true;
		return false;
	}

	/**
	 * Converts all values of linked list into String.
	 */
	public String toString(){
		String str = "";
		str += "[ ";
		Node current = head;
		while ( current !=  null){
			str += "( v: "+ current.value + ",p: "+ current.priority+ " )";
			current = current.next;	
			if (current !=  null){
				str += ", ";
			}
					
		}
		str += " ]";
		return str;
	}
	
	/**
	 * Inner class Node
	 * @author amrapoprzanovic
	 *
	 */
	public class Node{
		public int value;
		public Node next;
		public int priority;
		
		/**
		 * Constructor for Node, two parameters are forwarded value and priority.
		 * @param value - value of node.
		 * @param priority - priority of node.
		 */
		public Node(int value, int priority){
			this.value = value;
			this.priority=priority;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getValue() {
			return value;
		}

		public int getPriority() {
			return priority;
		}
		
		
	}
}
