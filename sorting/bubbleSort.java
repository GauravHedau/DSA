package sorting;

public class bubbleSort {

	public static void bubbleSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {

					// Swapping
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
	}

	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int a[] = { 5, 4, 1, 3, 2 };
		System.out.println("Original array");
		printArray(a);
		System.out.println("Sorted Array");
		bubbleSort(a);
		printArray(a);
	}

}
