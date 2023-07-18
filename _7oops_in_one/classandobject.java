package _7oops_in_one;


class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("it can write");
	}
	
	public void printcolor() {
		System.out.println(this.color);
	}
}

public class classandobject {

	public static void main(String[] args) {

		Pen p1 = new Pen();
		Pen p2 = new Pen();
		
		p1.color = "blue";
		p1.type = "gel"	;
		
		p2.color ="red";
		p2.type ="ball";
		
		
		p1.write();
		p2.printcolor();

	}
}
	
	
	
	
