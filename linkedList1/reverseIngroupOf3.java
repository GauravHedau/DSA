package linkedList1;

public class reverseIngroupOf3 {

	static void printLL(Node head) {
		Node cur = head;
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}

	public static Node reverseGroup(Node head, int k) {

		Node curr = head;
		Node prevFirst = null;
		Node newHead = null;

		while (curr != null) {
			int count = 0;
			Node prev = null;
			Node first = curr;

			while (curr != null && count < k) {
				Node temp = curr.next;
				curr.next = prev;
				prev=curr;
				curr = temp;
				count++;
			}
			
			if (newHead == null) {
				newHead = prev;
			} else {
				prevFirst.next = prev;
			}
			prevFirst = first;
		}
		return newHead;
	}

	public static void main(String args[]) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);

		printLL(head);
		int k = 3;
		Node newHead = reverseGroup(head, k);
		printLL(newHead);
	}
}

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}