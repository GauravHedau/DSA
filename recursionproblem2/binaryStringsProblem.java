package recursionproblem2;

public class binaryStringsProblem {

	public static void printBiString(int n, int lastPlace, String str) {
		// base case
		if (n == 0) {
			System.out.println(str);
			return;
		}

		printBiString(n - 1, 0, str + "0");

		if (lastPlace == 0) {
			printBiString(n - 1, 1, str + "1");
		}

	}

	public static void main(String[] args) {

		printBiString(3, 0, "");

	}

}
