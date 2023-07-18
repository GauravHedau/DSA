package arrayproblem1;

public class pairsInAnArray {

	public static void printPairs(int a[]) {

		int n = a.length;
		int count = 0;

		for (int i = 0; i < n; i++) {
			int current = a[i];
			for (int j = i + 1; j < n; j++) {
				System.out.print("(" + current + "," + a[j] + ")");
				count++;
			}
			System.out.println();

		}
		System.out.println("total pair " + count);
	}

	public static void main(String[] args) {

		int a[] = { 2, 4, 6, 8, 10 };

		printPairs(a);
	}

}
