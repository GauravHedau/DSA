package _4javaoops;


class Animal {
	int legs;
	String name;  
	
	void walk() {
		System.out.println(name + "  " + "is walking");
	}
	
	void walk(int steps) {
		System.out.println("Animal walked " + steps + " steps");
	}
	
	// if we modified the function on defined function then it will called method overloading
	public Animal() {
		System.out.println("call the constructor");
	}
	
	public Animal(String nickName) {
		System.out.println(nickName + " was passed while creating");
	}
}


public class mainclass {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal("bundus"); 
		
		a1.name = "simba";
		a1.legs = 4 ;
		
		a2.name = "bob";
		a2.legs = 2 ;
		
		a3.name = "bundus";
		a3.legs =3; 
		
	

		System.out.println(a1.name  + "  "  + a1.legs);
		System.out.println(a2.name  + "  "  + a2.legs);
		System.out.println(a3.name  + "  "  + a3.legs);

		a1.walk();
		a1.walk(5);

		
	}

}
