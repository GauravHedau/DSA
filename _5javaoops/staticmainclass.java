package _5javaoops;

class Alien {
	static boolean isMemberofearth = false;
	int legs;

	void speak() {
		System.out.println("alien speaks");
		sayHello();
	}

	void sayHello() {
		System.out.println("alien says Hello");
	}
}

public class staticmainclass {

	public static void main(String[] args) {

		Alien obj = new Alien();
		obj.legs = 3;

		Alien.isMemberofearth = true;

		add(3, 4);
	}

	static int add(int a, int b) {
		return (a + b);

	}

}
