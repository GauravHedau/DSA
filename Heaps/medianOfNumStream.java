package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class medianOfNumStream {

	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	public void insertNum(int num) {
		if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
			maxHeap.add(num);
		} else {
			minHeap.add(num);
		}

		if (minHeap.size() > minHeap.size() + 1) {
			minHeap.add(maxHeap.poll());
		} else if (maxHeap.size() < minHeap.size()) {
			minHeap.add(minHeap.poll());
		}
	}

	public double findMedian() {

		if (maxHeap.size() == minHeap.size()) {
			return maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
		}
		
		return maxHeap.peek();
	}

	public static void main(String[] args) {

	}

}
