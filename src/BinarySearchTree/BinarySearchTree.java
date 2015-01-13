package BinarySearchTree;

public class BinarySearchTree {

	private Node root;
	
	/**
	 * Constructor for BinarySearchTree.
	 */
	public BinarySearchTree (){
		this.root = null;
	}
	
	public void add(int value){
		if ( root == null){
			root = new Node(value);
		} else {
			add(root, value);
		}
	}
	
	private void add( Node current, int value) {
		// OVAJ DIO NE MOZE OVAKO RADITI - ne veže root sa ostatkom 
		if ( current == null){
			current = new Node(value);
			return;
		}
		//
		
		if( value <= current.value){
			if( current.left== null) {
				current.left = new Node (value);
				return;
			}
			add(current.left, value);
		} else {
			if( current.right== null) {
				current.right = new Node (value);
				return;
			}
			add(current.right, value);
		}
		
	}
	
	public boolean contains(int value){
		if( root.value ==  value)
			return true;
		else 
			return contains(root, value);
		
	}
	
	private boolean contains(Node current, int value) {
		if ( current == null){
			return false;
		}
		if ( current.value == value){
			return true;
		}
		
		if( value < current.value){
			return contains(current.left, value);
		} else {
			return  contains( current.right,  value);
		}
		
	}

	public void printTree (Node root){
		if( root == null){
			return;
		}		
	    printTree(root.left);
	    System.out.println(root.value);
	    printTree(root.right);
	}
	
	public Node getRoot() {
		return root;
	}

	/**
	 * Inner class Node
	 * @author amrapoprzanovic
	 *
	 */
	public class Node {
		public int value;
		public Node left;
		public Node right;
		
		public Node(int value){
			this.value = value;
			left = null;
			right =null;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public int getValue() {
			return value;
		}
	}
	
	// end of BinarySearchTree class
}
