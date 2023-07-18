package recursionbasicsapn;

public class basics {

	static int i = 0;

	static void dummyFunc() {
		System.out.println(i++);
		dummyFunc();
	}

	public static void main(String[] args) {

		dummyFunc();
	}

}
