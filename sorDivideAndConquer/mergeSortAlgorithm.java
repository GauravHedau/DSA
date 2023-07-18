package sorDivideAndConquer;

public class mergeSortAlgorithm {

	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void mergeSort(int a[], int si, int ei) {

		if (si < ei) {

			int mid = si + (ei - si) / 2;

			mergeSort(a, si, mid); // sort left part
			mergeSort(a, mid + 1, ei); // sort right part
			merge(a, si, mid, ei);
		}

	}

	public static void merge(int[] a, int si, int mid, int ei) {
		int temp[] = new int[ei - si + 1];

		int i = si;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= ei) {
			if (a[i] <= a[j]) {
				temp[k] = a[i];
				i++;
			} else {
				temp[k] = a[j];
				j++;
			}
			k++;
		}

		// left part remaining
		while (i <= mid) {
			temp[k++] = a[i++];
		}

		// right part remaining
		while (j <= ei) {
			temp[k++] = a[j++];
		}

		// copy temp to original array
		for (k = 0, i = si; k < temp.length; k++, i++) {
			a[i] = temp[k];
		}
	}

	public static void main(String[] args) {

		int a[] = { 6, 3, 9, 5, 2, 8 };
		mergeSort(a, 0, a.length - 1);
		printArray(a);
	}

}
