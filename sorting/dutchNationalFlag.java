package sorting;

public class dutchNationalFlag {

	public static void dutchnationalFlag(int a[]) {

		int i = 0;
		int j = 0;
		int n = a.length - 1;
		int p = 1;
		while (j <= n) {
			if (a[j] < p) {
				swap(a, i, j);
				i++;
				j++;
			} else if (a[j] > p) {
				swap(a, j, n);
				n--;
			} else {
				j++;
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {

		int a[] = { 2, 2, 1, 0, 0, 1, 2, 0, 1 };

		dutchnationalFlag(a);
		printArray(a);
	}

}
