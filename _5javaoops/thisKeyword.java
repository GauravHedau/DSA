package _5javaoops;

class KeyWord {
	int i;

	void setValue(int i) {
		this.i = i; // if doesn't add this keyword it will show default value of i that is 0
	}

	void show() {
		System.out.println(i);
	}
}

public class thisKeyword {

	public static void main(String[] args) {

		KeyWord k = new KeyWord();
		k.setValue(43);
		k.show();
	}

}
