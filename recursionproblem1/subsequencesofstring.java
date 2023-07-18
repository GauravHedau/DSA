package recursionproblem1;

public class subsequencesofstring {

	public static void subsequences(String str, int index, String newString) {

		if (index == str.length()) {
			System.out.println(newString);
			return;
		}
		char curChar = str.charAt(index);

		// to be part
		subsequences(str, index + 1, newString + curChar);

		// or not to be part
		subsequences(str, index + 1, newString);
	}

	public static void main(String[] args) {

		String str = "abc";
		subsequences(str, 0, "");

	}

}
