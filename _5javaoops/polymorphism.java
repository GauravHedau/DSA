package _5javaoops;

//runtime or function method overriding 
//same name
//different class 
//same arguments

class MobilePhone2 {

	void playGames() {
		System.out.println("mobile phone playing games");

	}
}

class Nokia extends MobilePhone2 {

	void playGames() {
		System.out.println("nokia playing games");
	}
}

//compile time function method overloading
//same name
//same class
//Different argument 

class Test {
	void show() {
		System.out.println("1");
	}

	void show(int a) {
		System.out.println("2");
	}

	void show(double b) {
		System.out.println("3");
	}
}

public class polymorphism {

	public static void main(String[] args) {

		Nokia s10 = new Nokia();
		s10.playGames();

		Test t = new Test();
		t.show();
		t.show(3);
	}

}
