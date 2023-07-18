package _0Assignment;

import java.util.Scanner;

public class greaternumberfromtwonumber {
	
	public static void greaterFromTwoNum(int a , int b) {
		if( a > b) {
			System.out.println("Greater Number is a " + a);
		} else if (a == b){
			System.out.println("Both are Equal");
		} else {
			System.out.println("Greater Number is b " + b);
		}
	}

	public static void main(String[] args) {

		//. Write a function which takes in 2 numbers and returns the greater of those two.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");

		int b = sc.nextInt();
		
		greaterFromTwoNum(a ,b);
	}

}
