package LinkedList;

public class llBasicByAnuj {

	static void printLL(Node<Integer> head) {
		Node<Integer> cur = head;
		while (cur != null) {
			System.out.print(cur.data + " -> ");
			cur = cur.next;
		}
		System.out.println("NULL");
	}

	static Node<Integer> insertLL(int data, int position, Node<Integer> head) {
		Node<Integer> newNode = new Node<>(data);
		
		if (position == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		}

		Node<Integer> curr = head;
		for (int i = 0; i < position - 1; i++) {
			curr = curr.next;
		}
		newNode.next = curr.next;
		curr.next = newNode;
		return head;
	}
	
	static Node<Integer> deleteLL( int position, Node<Integer> head) {
		if(head == null) {
			return null;
		}
		if(position == 0) {
			head = head.next;
			return head;
		}
		Node<Integer> curr = head;
		for(int i =0;i<position-1;i++) {
			curr = curr.next;
		}
		curr.next= curr.next.next;
		return head;
	}

	static int findMiddle(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		while(fast!=null &&fast.next!= null) {
			slow = slow.next;
			fast= fast.next.next;
		}
		return slow.data;
	}
	
	public static void main(String[] args) {
      
		
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		Node<Integer> n5 = new Node<>(50);
//		Node<Integer> n6 = new Node<>(60);

		
		Node<Integer> head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
//		n5.next = n6;

		printLL(head);
		
		head = insertLL(100, 3, head);
		printLL(head);
		
		head = deleteLL(3, head);
		printLL(head);

		System.out.print("Middle element for this list: ");
		System.out.println(findMiddle(head));
	}

}

class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) { // constructor
		this.data = data;
		this.next = null;
	}
}