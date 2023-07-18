package _2javabasics;

import java.util.Scanner;

public class simplecalculater {

	public static int calculateAddition(int a, int b) {
		return a + b;
	}

	public static int calculateSubtraction(int a, int b) {
		return a - b;
	}

	public static int calculateProduct(int a, int b) {
		return a * b;
	}

	public static int calculateDivision(int a, int b) {
		return a / b;
	}

	public static int calculateModula(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1 Addition");
		System.out.println("2 Subtraction");
		System.out.println("3 Product");
		System.out.println("4 Division");
		System.out.println("5 Modula");

		System.out.println("Select the Operation you want to Preform");
		int x = sc.nextInt();

		if (x <= 5) {
			
			System.out.println("Enter First Number");
			int a = sc.nextInt();
			
			System.out.println("Enter Second Number");
			int b = sc.nextInt();
			switch (x) {
			case 1:
				System.out.println("Addition of respective number : " + calculateAddition(a, b));
				break;
			case 2:
				System.out.println("Subtraction of respective number : " + calculateSubtraction(a, b));
				break;
			case 3:
				System.out.println("Sum of respective number : " + calculateProduct(a, b));
				break;
			case 4:
				System.out.println("Division of respective number : " + calculateDivision(a, b));
				break;
			case 5:
				System.out.println("Modula of respective number : " + calculateModula(a, b));
				break;
			default:
				System.out.println("* * Please select correct option you want to perform * *");

			}
		} else {
			System.out.println("Please select correct option");
		}
	}

}
