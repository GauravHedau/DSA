package linkedList1;

public class palindromeLinkedList {

	static void printLL(Node head) {
		Node cur = head;
		while (cur != null) {
			System.out.print(cur.data + " -> ");
			cur = cur.next;
		}
		System.out.println("NULL");
	}

	static Node findMiddle(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

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

	public static boolean isPalindrome(Node head) {
		if (head == null || head.next == null) {
			return true;
		}
		Node mid = findMiddle(head);
		Node rev = reverse(mid);

		Node left = head;
		Node right = rev;

		while (right != null) {
			if (left.data != right.data) {
				return false;
			}
			left = left.next;
			right = right.next;
		}
		return true;

	}

	public static void main(String[] args) {

		Node head = new Node(3);
		head.next = new Node(1);
		head.next.next = new Node(2);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(1);
		head.next.next.next.next.next = new Node(3);

		Node head1 = new Node(3);
		head1.next = new Node(2);
		head1.next.next = new Node(2);
		head1.next.next.next = new Node(1);
		head1.next.next.next.next = new Node(3);
		
		
		printLL(head);
		System.out.println(isPalindrome(head));
		
		System.out.println(isPalindrome(head1));


	}

}
