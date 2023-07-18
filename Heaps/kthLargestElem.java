package Heaps;

import java.util.PriorityQueue;

public class kthLargestElem {

	public static int kthLar(int a[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < k; i++) {
			pq.add(a[i]);

		}
		for (int i = k; i < a.length; i++) {
			if (pq.peek() < a[i]) {
				pq.poll();
				pq.add(a[i]);
			}
		}
		return pq.peek();
	}

	public static void main(String[] args) {

		int a[] = { 20, 10, 30, 50, 60, 40 };

		System.out.println(kthLar(a, 3));
		
	}

}
