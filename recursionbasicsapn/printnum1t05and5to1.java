package recursionbasicsapn;

public class printnum1t05and5to1 {

	public static void printNumb(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n + " ");
		printNumb(n - 1);
	}

	public static void printNumb1(int g) {
		if (g == 0) {
			return;
		}
		printNumb1(g - 1);
		System.out.print(g + " ");

	}

	public static void main(String[] args) {

		int n = 5;

		printNumb(n);

		System.out.println();
		int g = 5;

		printNumb1(g);

	}

}
