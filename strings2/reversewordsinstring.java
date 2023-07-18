package strings2;

public class reversewordsinstring {

	static void reverseCharacters(char[] s, int i, int j) {
		while (i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;

			i++;
			j--;
		}
	}

	public static String reverseWord(String str) {
		char[] c = str.toCharArray();

		int start = 0;
		int end = 0;
		for (; end < str.length(); end++) {
			if (c[end] == ' ') {
				reverseCharacters(c, start, end - 1);
				start = end + 1;
			}
		}
		reverseCharacters(c, start, end - 1);

		// step2
		reverseCharacters(c, 0, str.length() - 1);
		return new String(c);
	}

	public static void main(String[] args) {

		String str = "I Am The Boss";

		String ans = reverseWord(str);
		System.out.println(ans);

	}

}
