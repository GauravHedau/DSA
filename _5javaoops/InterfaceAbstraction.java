package _5javaoops;

interface I1 {
	void show();
}

interface I2 {
	void run();
}

class Demo implements I1, I2 {
	public void show() {
		System.out.println("1");
	}

	public void run() {
		System.out.println("2");
	}
}

public class InterfaceAbstraction {

	public static void main(String[] args) {

		Demo t = new Demo();
		t.show();
	}

}
