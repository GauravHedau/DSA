package _5javaoops;

class Mobilephone {
	boolean hasheadphonejacks;
	int Price;
	String os;
	int dimen;

	void playgames() {
		System.out.println("mobile phone playing games");
	}
}

//Samsung and apple inherits Mobilephone 

class Samsung extends Mobilephone {
	
	void playgames() {
		System.out.println("samsung playing game");
	}
}

class Apple extends Mobilephone {

}

public class inheritence {

	public static void main(String[] args) {

		Samsung s10 = new Samsung();
		s10.playgames();

		Apple a13 = new Apple();

		a13.Price = 900000;
		System.out.println(a13.Price);
		a13.playgames();
	}

}
