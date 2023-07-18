package arrayproblem1;

public class reversethegivenarray {

	static void printarray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

	static void reversearray(int a[], int start, int end) {
		int temp;
		while (start < end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		printarray(a);
		
		reversearray(a, 0, 5);
		System.out.println("Reverse array become");
		printarray(a);
	}
}