package _3javamethod;

import java.util.Scanner;

public class javamethodbasic {

	// for String
	public static void PrintMyName(String name) {
		System.out.println("Your name is " + name);
		return;
	}

	// for int
	public static int number(int age, int giftedage) {
		System.out.println("Your age is " + age);
		if(giftedage < age) {
			System.out.println("Your gifted age is " + giftedage);
		} else {
			System.out.println("this gifted age is not for use");
		}
		return 1; // for any other return type we have to return their respective value anything
					// in datatype

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		PrintMyName(name);

		int age = sc.nextInt();
		int giftedage = sc.nextInt();

		number(age, giftedage);
	}

}
