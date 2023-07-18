package math1;

public class gcdorhcf {
	public static int gcd(int a , int b) {
		System.out.println(a + " " + b);
		if (a == b)
			return a;
		
		if(a < b) 
			return gcd(b , a);
			return gcd(a-b , b);
		
	}
 // we can do it in terms of modulo to reduce the step in output
	
	public static void main(String[] args) {

		int a =60;
		int b =24;
		System.out.println(gcd(a, b));
		
	}

}
