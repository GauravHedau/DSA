package Heaps;

public class heapsort {

	public static void heapify(int a[], int i, int size) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int maxIndex = i;

		if (left < size && a[left] > a[maxIndex]) {
			maxIndex = left;
		}

		if (right < size && a[right] > a[maxIndex]) {
			maxIndex = right;
		}

		if (maxIndex != i) {
			// swap
			int temp = a[i];
			a[i] = a[maxIndex];
			a[maxIndex] = temp;

			heapify(a, maxIndex, size);

		}
	}

	public static void heapSort(int a[]) {

		// step 1 build maxHeap
		int n = a.length;
		for (int i = n / 2; i >= 0; i--) {
			heapify(a, i, n);

		}

		// step2 - push largest at end
		for (int i = n - 1; i > 0; i--) {
			// swap (largest-first with last)
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;

			heapify(a, 0, i);
		}

	}
	
	public static void main(String[] args) {
		int a[] = {1, 2, 4, 5, 3 };
		heapSort(a);
		
		//print
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
