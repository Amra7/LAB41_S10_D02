package predavanjeTree;

import javax.print.attribute.standard.MediaSize.Other;

public class TreeString {

	private String data;
	private TreeString left;
	private TreeString right;

	/**
	 * Constructor for TreeString.
	 */
	public TreeString() {
		this.data = null;
		this.left = null;
		this.right = null;
	}

	/**
	 * Constructor for TreeString with one parameter data.
	 * 
	 * @param data
	 *            - new data that we forward.
	 */
	public TreeString(String data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	/**
	 * @return the left
	 */
	public TreeString getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(TreeString left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public TreeString getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(TreeString right) {
		this.right = right;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * Adds new data in Tree String.
	 * 
	 * @param data
	 *            - new data that we forward.
	 */
	public void add(String data) {
		// U slucaju da prvobitno koristimo konstruktor 
		// bez prosljedjivanja "data".
		
		if (this.data == null) {
			this.data = data;
			return;
		}
		if (this.data.compareToIgnoreCase(data) > 0) {
			if (left == null) {
				left = new TreeString(data);
				return;
			}
			left.add(data);
		} else {
			if (right == null) {
				right = new TreeString(data);
				return;
			}
			right.add(data);
		}
	}

	// pre order print SLD
	/**
	 * Pre Order print of list.
	 */
	public void preOrderPrint() {

		System.out.println(data);
		if (left != null) {
			left.preOrderPrint();
		}
		if (right != null) {
			right.preOrderPrint();
		}

	}

	// in order print LSD
	/**
	 * In Order print of list.
	 */
	public void inOrderPrint() {

		if (left != null) {
			left.preOrderPrint();
		}
		System.out.println(data);
		if (right != null) {
			right.preOrderPrint();
		}

	}

	// post order print LDS
	/**
	 * Post Order print of list.
	 */
	public void postOrderPrint() {

		if (left != null) {
			left.preOrderPrint();
		}

		if (right != null) {
			right.preOrderPrint();
		}
		System.out.println(data);

	}
}
