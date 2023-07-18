package LinkedList;

public class linkedListBasics {

	Node head;
	private int size;

	public class Node {
		String data;
		Node next; // it represent next node

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	// add at first
	public void addFirst(String data) {
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

	public void addLast(String data) {
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

	// delete first
	public void deleteFirst() {
		if (head == null) {
			System.out.println("The list is empty");
			return;
		}
		size--;
		head = head.next;
	}

	// delete last
	public void deleteLast() {
		if (head == null) {
			System.out.println("The list is empty");
			return;
		}

		size--;
		if (head.next == null) { // when only one node is present in linked list
			head = null;
			return;
		}

		Node secondLast = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {

		linkedListBasics list = new linkedListBasics();
		list.addLast("is");
		list.addLast("a");
		list.addLast("list");
		list.PrintList();

		list.addFirst("this");
		list.PrintList();
		System.out.println(list.getSize());

		list.deleteFirst();
		list.PrintList();

		list.deleteLast();
		list.PrintList();

	}

}
