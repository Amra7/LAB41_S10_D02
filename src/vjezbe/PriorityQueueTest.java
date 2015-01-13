package vjezbe;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		
		// test isEmpty
		System.out.println("Empty: " + pq.isEmpty());
		
		// test add
		pq.push(4, 6);
		pq.push(5, 1);
		pq.push(3, 3);
		pq.push(41, 5);
		pq.push(5, 4);
		pq.push(12, 7);
		pq.push(16, 2);
		
		System.out.println(pq.toString());
		
		// test pop
		pq.pop();
		System.out.println("After pop \n" + pq.toString());
		
		// test peek
		System.out.println("Peek: " + pq.peek());
		
		//test getSize
		System.out.println("Get size: " + pq.getSize());
		
		// test contains
		System.out.printf("Contains: value %d - %b", 5,pq.contains(5));
		
		// test isEmpty
		System.out.println("\nEmpty: " + pq.isEmpty());
	}
}
