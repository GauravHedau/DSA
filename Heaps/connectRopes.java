package Heaps;

import java.util.PriorityQueue;

public class connectRopes {

	public static void main(String[] args) {

		int ropes[] = { 2, 5, 4, 8, 9, 6 };
 
		// by default priority queue add min element at first
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < ropes.length; i++) {
			pq.add(ropes[i]);
		}
		int cost = 0;
		while (pq.size() > 1) {
			int min = pq.remove();
			int min2 = pq.remove(); 
			cost += min + min2;
			pq.add(min + min2);
		}
		System.out.println("cost of connecting = " + cost);
	}

}
