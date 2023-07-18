package sorDivideAndConquer;

public class quickSort {

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void quickSorT(int a[], int l, int h) {

		if (l < h) {
			int pivot = partition(a, l, h);
			quickSorT(a, l, pivot - 1);
			quickSorT(a, pivot + 1, h);
		}

	}

	public static int partition(int[] a, int l, int h) {

		int i = l;
		int j = h;
		int pivot = a[l];
		while (i < j) {
			while (i < j && a[i] <= pivot) {
				i++;
			}
			while (a[j] > pivot) {
				j--;
			}
			if (i < j) {
				swap(a, i, j); // swap a[i] and a[j] for a[i] > pivot and [j] < pivot
			}
		}
		swap(a, l, j); // swap pivot element with j
		return j;
	}

	public static void main(String[] args) {

		int a[] = { 6, 3, 9, 8, 2, 5 };
		quickSorT(a, 0, a.length - 1);
		printArray(a);
	}

}
