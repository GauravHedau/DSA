package sorting;

public class unionOfTwoSortedArray {

	public static void unionSortedArray(int a[], int b[]) {

		int i = 0;
		int j = 0;

		while (i < a.length && j < b.length) {
			if (i > 0 && a[i] == a[i - 1]) {
				i++;
				continue;
			} else if (j > 0 && b[j] == b[j - 1]) {
				j++;
				continue;
			}
			if (a[i] < b[j])
				System.out.print(a[i++] + " ");
			else if (b[j] < a[i])
				System.out.print(b[j++] + " ");
			else {
				System.out.print(b[j++] + " ");
				i++;
			}
		}
		while (i < a.length)
			System.out.print(a[i++] + " ");
		while (j < b.length)
			System.out.print(b[j++] + " ");

	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 3, 5 };
		int b[] = { 2, 3, 3, 4 };

		unionSortedArray(a, b);
	}

}
