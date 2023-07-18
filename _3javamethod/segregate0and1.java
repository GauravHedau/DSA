package _3javamethod;

public class segregate0and1 {

	public static void segregate(int a[], int n) {
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			a[i] = 0;
		}
		for (int i = count; i < n; i++) {
			a[i] = 1;
		}
		System.out.print("After segregation :- ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		return;
	}

	public static void main(String[] args) {

		int a[] = { 0, 1, 1, 0, 1, 0, 1, 1, 0 };
		int n = a.length;
		segregate(a, n);
	}
}
