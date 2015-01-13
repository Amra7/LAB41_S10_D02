package predavanjeTree;

public class TreeStringTest {

	public static void main(String[] args) {
		
		TreeString ts = new TreeString();
		
		ts.add("Ja");
		ts.add("volim");
		ts.add("da");
		ts.add("jedem");
		ts.add("kolace");
		
		System.out.println("pre order: ");
		ts.preOrderPrint();
		
		System.out.println("\nin order: ");
		ts.inOrderPrint();
		
		System.out.println("\npost order: ");
		ts.postOrderPrint();
	}
}
