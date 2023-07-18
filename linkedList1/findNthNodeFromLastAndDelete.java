package linkedList1;

public class findNthNodeFromLastAndDelete {

	
	static void printLL(Node head) {
		Node cur = head;
		while (cur != null) {
			System.out.print(cur.data + " -> ");
			cur = cur.next;
		}
		System.out.println("NULL");
	}
	 
	public static Node removeNthfromLast(Node head, int n) {

		if (head.next == null) {
			return null;
		}
		int size = 0;
		Node curr = head;

		while (curr != null) {
			curr = curr.next;
			size++;

		}
		if (n == size){
			return head.next;
		}

		int indxToSearch = size - n;
		Node prev = head;

		int i = 1;
		while (i < indxToSearch) {
			prev = prev.next;
			i++;
		}

		prev.next = prev.next.next;
		return head;
	}

	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);

		printLL(head);
		Node newHead = removeNthfromLast(head, 4);
		printLL(newHead);
	}

}

