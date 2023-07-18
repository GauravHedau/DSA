package LinkedList;

public class reverseLinkdList {

	Node head;
	private int size;

	class Node {
		int data;
		Node next; // it represent next node

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// add at first
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		size++;
		newNode.next = head;
		head = newNode;
	}

	// add at last

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		size++;

		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	// print list
	public void PrintList() {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}

		System.out.println("NULL");
	}

	
	// reverse linked list Anuj iterative

	public static Node reverse(Node head) {
		Node cur = head;
		Node prev = null;
		while (cur != null) {
			Node temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		} 
		return prev;
	}

	// reverse linked list Anuj recursive

	public static Node revrseRecursive(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node newHead = revrseRecursive(head.next);
		Node temp = head.next;
		temp.next = head;
		head.next = null;

		return newHead;
	}
 
//	
//	// reverse linked list Apna College iterative
//		public void reverseList() {
//			if (head == null || head.next == null) {
//				return;
//			}
//
//			Node prevNode = head;
//			Node currNode = head.next;
//			while (currNode != null) {
//				Node nextNode = currNode.next;
//				currNode.next = prevNode;
//				prevNode = currNode;
//				currNode = nextNode;
//			}
//			head.next = null;
//			head = prevNode;
//		}
//
//		// reverse linked list Apna College recursive
//
//		public static Node reverseRecursive(Node head) {
//			if (head == null || head.next == null) {
//				return head;
//			}
//
//			Node newHead = reverseRecursive(head.next);
//			head.next.next = head;
//			head.next = null;
//
//			return newHead;
//		}

	public static void main(String[] args) {

		reverseLinkdList list = new reverseLinkdList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.PrintList();

//		list.reverseList();
//		list.head = list.reverseRecursive(list.head);

//		list.head = list.reverse(list.head);
		list.head = list.revrseRecursive(list.head);

		list.PrintList();

	}

}
