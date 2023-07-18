package _3javamethod;

import java.util.Scanner;

public class calculatesumandproduct {

	public static int calculateSum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static int calculateProduct(int a , int b) {
		return a*b;
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = calculateSum(a, b);
		System.out.println("Sum of respective number : " + sum);
	
		int Product = calculateProduct(a, b);
		System.out.println("Product of respective number : " + Product);
	
		 
	}

}
