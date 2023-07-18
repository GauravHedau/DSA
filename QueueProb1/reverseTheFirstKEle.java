package QueueProb1;

import java.util.ArrayDeque;
import java.util.Queue;

public class reverseTheFirstKEle {

	static Queue<Integer> reverseK(Queue<Integer> q, int k) {

		int n = q.size();
		if (q.isEmpty() || k <= 0 || k > q.size()) {
			return q;
		}
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		for (int i = 0; i < k; i++) {
			stack.push(q.poll());
		}

		while (!stack.isEmpty()) {
			q.add(stack.pop());
		}
		for (int i = 0; i < n - k; i++) {
			q.add(q.poll());

		}
		return q;
	}

	public static void main(String[] args) {

		Queue<Integer> q = new ArrayDeque<>();

		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		int k = 3;

		System.out.println(q);
		reverseK(q, k);
		System.out.println(q);
	}

}
