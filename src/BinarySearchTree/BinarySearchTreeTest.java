package BinarySearchTree;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(5);
		bst.add(6);
		bst.add(7);
		bst.add(8);
		bst.add(12);
		bst.add(14);
		
		bst.printTree(bst.getRoot());
		
		// test boolean
		System.out.printf("Contains: %d - %b", 7, bst.contains(7));
		System.out.printf("\nContains: %d - %b", 87, bst.contains(87));
		
	}
}
