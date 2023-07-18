
package _6javaoops3PW;

public class encapsualation1 {

	public static void main(String[] args) {

		// class object = newKeyword constructor();
		Employee e1 = new Employee();
		Employee e2 = new Employee(234 , "gaurav");

		System.out.println(e1.getphone());
		System.out.println(e1.getName());
		
		e2.setPhone(534);
		e2.setName("rakesh");
		
		System.out.println(e2.getphone());
		System.out.println(e2.getName());
		
		
	}

}
