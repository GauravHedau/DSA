package _4javaoops;

class Animals {

	String color;
	int age;

	public void eat() {
		System.out.println("I am eating");
	}

	public void bark(String sound, int radiusOfVoice) {
		System.out.println(sound + " spread " + radiusOfVoice + " distance ");
	}

	public void run() {
		System.out.println("Running");
	}

}

class Birds {
	public void fly() {
		System.out.println("Flying");
	}
}

public class classAndObjectSmartProg {

	public static void main(String[] args) {

		Animals buzo = new Animals();
		buzo.eat();
		buzo.run();

		buzo.color = "red";
		buzo.age = 20;

		System.out.println(buzo.color + " " + buzo.age);

		buzo.bark("louder", 30);

		Birds owl = new Birds();
		owl.fly();
	}

}
