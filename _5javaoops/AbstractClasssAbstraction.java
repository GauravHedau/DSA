package _5javaoops;

abstract class Vehicle {
	int no_ofTyre;

	abstract void start();
}

class Car extends Vehicle {
	void start() {
		System.out.println("Start with key");
	}
}

class Scooter extends Vehicle {
	void start() {
		System.out.println("Start with Kick");
	}
}

public class AbstractClasssAbstraction {

	public static void main(String[] args) {

//		Vehicle v = new Vehicle(); because vehicle is abstract class and to create a object of abstract class is not possible.

		Car c = new Car();
		c.start();

		Scooter s = new Scooter();
		s.start();
	}

}
