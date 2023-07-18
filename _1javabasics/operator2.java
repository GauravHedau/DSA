package _1javabasics;

public class operator2 {

	public static void main(String[] args) {

		// Arithmetic operator
		
		int a = 30;
		int b = 40;
		int sum = a + b;
		System.out.println(sum);
		
		int a1 = 30;
		int b1 = 40;
		int diff = a1 - b1;
		System.out.println(diff);
		
		int a2 = 30;
		int b2 = 40;
		int mul = a2 * b2;
		System.out.println(mul);
		
		int a3 = 80;
		int b3 = 40;
		int div = a3 / b3;
		System.out.println(div);
		//in int only quiotent is given as output
		
		//for full value example with point value
		double g = 89;
		double h = 40;
		double div1 = g / h;
		System.out.println(div1);
				
		
		// modulo (%) gives the value of remainder in division 
		
		int a4 = 83;
		int b4 = 40;
		int m = a4 % b4;
		System.out.println(m);
		
		
		//assignment operator 
		
		//r += t  means r= r + t
		int t =2;
		int r =10;
		System.out.println(r += t);
		
		//r -= t  means r= r - t
		System.out.println(r -= t);

		//r *= t  means r= r * t
		System.out.println(r *= t);

		//r /= t  means r= r / t
		System.out.println(r /= t);

		//in all assignment operator all the operation made on the new value of r 
		
		//relational operator
		int w =3;
		int x =5;
		System.out.println(w>x);
		System.out.println(w<x);
		System.out.println(w>=x);
		System.out.println(w<=x);
		System.out.println(w==x);
		System.out.println(w!=x);
		
		//!= = not equal to
		
		
		//unary operator
		
		 int q =4;
		 System.out.println(q++);
		 System.out.println(q);
		 
		 int p =6;
		 System.out.println(++p);
		 System.out.println(p);

		 int s =4;
		 System.out.println(s--);
		 System.out.println(s);
		 
		 int k =6;
		 System.out.println(--k);
		 System.out.println(k);
		 
		 //bitwise operator

		 int i = 60;
		 System.out.println(i<<2);
	     // for left num**2
		 
		 int j=60;
		 System.out.println(j>>2);
		 // right shift num//2
		 
		 
	}

}
