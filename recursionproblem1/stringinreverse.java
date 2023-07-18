package recursionproblem1;

public class stringinreverse {

	public static void reversestring(String str, int index) {
		if (index == 0) {
			System.out.println(str.charAt(index));
			return;
		}

		System.out.print(str.charAt(index));
		reversestring(str, index - 1);
	}

	public static void main(String[] args) {

		String str = "zyxwvutsrqponmlkjihgfedcba";
		reversestring(str, str.length() - 1);

	}

}