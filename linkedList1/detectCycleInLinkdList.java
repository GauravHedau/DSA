package linkedList1;

public class detectCycleInLinkdList {

	static Node isCyclePres(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

	static Node detectNode(Node head) {
		Node meet = isCyclePres(head);
		Node start = head;

		while (start != meet) {
			start = start.next;
			meet = meet.next;
		}
		return start;
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
		head.next.next.next.next.next.next.next = head.next.next.next.next;

		Node meet = isCyclePres(head);
		if (meet != null) {
			System.out.println("cycle is present");
		} else {
			System.out.println("cycle is not present");
		}
		
		Node start = detectNode(head);
		System.out.println(start.data);
	}

}
