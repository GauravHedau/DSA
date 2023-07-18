package Heaps;

import java.util.*;

public class heapBasics {

	static class MinHeap {
		ArrayList<Integer> arr = new ArrayList<>();

		public void insert(int data) {
			// add at last index
			arr.add(data);

			int x = arr.size() - 1; // x is child index
			int par = (x - 1) / 2; // par index

			while (arr.get(x) < arr.get(par)) {
				// swap
				int temp = arr.get(x);
				arr.set(x, arr.get(par));
				arr.set(par, temp);
			}
		}

		public void heapify(int i) {
			int left = 2 * i + 1;
			int right = 2 * i + 2;
			int minIndex = i;

			if (left < arr.size() && arr.get(minIndex) > arr.get(left)) {
				minIndex = left;
			}

			if (right < arr.size() && arr.get(minIndex) > arr.get(right)) {
				minIndex = right;
			}
			if (minIndex != i) {
				// swap
				int temp = arr.get(i);
				arr.set(i, arr.get(minIndex));
				arr.set(minIndex, temp);

				heapify(minIndex);
			}
		}

		public int peek() {
			return arr.get(0);
		}

		public int remove() {
			int data = arr.get(0);

			// step 1 - swap first & last
			int temp = arr.get(0);
			arr.set(0, arr.get(arr.size() - 1));
			arr.set(arr.size() - 1, temp);

			// step 2 - delete last
			arr.remove(arr.size() - 1);

			// step 3 - heapify
			heapify(0);
			return data;

		}

		public boolean isEmpty() {
			return arr.size() == 0;
		}

	}

	public static void main(String[] args) {

		MinHeap h = new MinHeap();
		h.insert(3);
		h.insert(4);
		h.insert(1);
		h.insert(5);
		h.insert(7);

		while (!h.isEmpty()) { // heap sort  - O(nlogn)
			System.out.println(h.peek());
			h.remove();
		}

	}

}
